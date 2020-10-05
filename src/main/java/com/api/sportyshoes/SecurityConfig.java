package com.api.sportyshoes;

import java.io.Console;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

//import java.util.logging.LogManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger log = LogManager.getLogger();

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Note: 
        // Use this to enable the tomcat basic authentication (tomcat popup rather than spring login page)
        // Note that the CSRf token is disabled for all requests
        log.info("Disabling CSRF, enabling basic authentication...");
        http
        .authorizeRequests()
            .antMatchers("/**").authenticated() // These urls are allowed by any authenticated user
        .and().httpBasic();
        http.authorizeRequests().antMatchers( "/h2/**").permitAll();
        http.csrf().disable();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        log.info("Setting in-memory security using the user input...");

        String username = null;
        String password = null;

        System.out.println("\nPlease set the admin credentials for this web application (will be required when browsing to the web application)");
        Console console = System.console();
        
        
        
     // Read the credentials from the user console: 
        // Note: 
        // Console supports password masking, but is not supported in IDEs such as eclipse; 
        // thus if in IDE (where console == null) use scanner instead:
        if (console == null) {
            // Use scanner:
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Username: ");
                username = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();
                System.out.print("Confirm Password: ");
                String inputPasswordConfirm = scanner.nextLine();

                if (username.isEmpty()) {
                    System.out.println("Error: user must be set - please try again");
                } else if (password.isEmpty()) {
                    System.out.println("Error: password must be set - please try again");
                } else if (!password.equals(inputPasswordConfirm)) {
                    System.out.println("Error: password and password confirm do not match - please try again");
                } else {
                    log.info("Setting the in-memory security using the provided credentials...");
                    break;
                }
                System.out.println("");
            }
            scanner.close();
        } else {
            // Use Console
            while (true) {username = console.readLine("Username: ");
            char[] passwordChars = console.readPassword("Password: ");
            password = String.valueOf(passwordChars);
            char[] passwordConfirmChars = console.readPassword("Confirm Password: ");
            String passwordConfirm = String.valueOf(passwordConfirmChars);

            if (username.isEmpty()) {
                System.out.println("Error: Username must be set - please try again");
            } else if (password.isEmpty()) {
                System.out.println("Error: Password must be set - please try again");
            } else if (!password.equals(passwordConfirm)) {
                System.out.println("Error: Password and Password Confirm do not match - please try again");
            } else {
                log.info("Setting the in-memory security using the provided credentials...");
                break;
            }
            System.out.println("");
        }
    }

    // Set the inMemoryAuthentication object with the given credentials:
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    if (username != null && password != null) {
        String encodedPassword = passwordEncoder().encode(password);
        manager.createUser(User.withUsername(username).password(encodedPassword).roles("USER").build());
    }
    return manager;
}
    @Override
    public void configure(WebSecurity web) throws Exception {
       web
            .ignoring()
           .antMatchers("/h2/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

