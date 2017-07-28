package com.demo.resourceserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Created by macintosh on 7/28/17.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() // The first way to security the resource
                .antMatchers("/public/**").permitAll()
                //.antMatchers("/user/**").hasAuthority("USER")
                //.antMatchers("/admin/**").hasAuthority("ADMIN")
                .anyRequest().authenticated();
    }
}
