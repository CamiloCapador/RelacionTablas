package com.example.RelacionTablas.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class Seguridad {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("1234a"))
                .roles("admin")
                .build();
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder().encode("1234u"))
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(admin, user);

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
