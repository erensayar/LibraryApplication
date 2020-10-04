package com.erensayar.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author ErenSayar
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/css/**",
                        "/webjars/**").permitAll()
                .antMatchers(
                        "/home",
                        "/detailsOfAuthor",
                        "/detailsOfBook",
                        "/detailsOfPublisher",
                        "/api/get/**").access("hasRole('USER')")
                .antMatchers(
                        "/home",
                        "/detailsOfAuthor",
                        "/detailsOfBook",
                        "/detailsOfPublisher",
                        "/api/get/**",
                        "/addAuthor",
                        "/addBook",
                        "/addPublisher",
                        "/api/admin/**").access("hasRole('ADMIN')")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();

        http.csrf().disable();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {

        UserDetails user
                = User.withDefaultPasswordEncoder()
                .username("user")
                .password("123")
                .roles("USER")
                .build();

        UserDetails admin
                = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }


}
