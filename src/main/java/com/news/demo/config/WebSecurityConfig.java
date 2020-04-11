package com.news.demo.config;

import com.news.demo.entity.Users;
import com.news.demo.repo.UserDetailsRepo;
import org.apache.tomcat.jni.User;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.time.LocalDateTime;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated();
            //.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
    }

    @Bean
    public PrincipalExtractor principalExtractor(UserDetailsRepo userDetailsRepo) {
        return map -> {
            System.out.println(map);
            String id = (String) map.get("sub");
            Users user = userDetailsRepo.findById(id).orElseGet(() -> {
                Users newUser = new Users();

                newUser.setId(id);
                newUser.setName( (String) map.get("name"));
                newUser.setEmail( (String) map.get("email"));
                newUser.setGender( (String) map.get("gender"));
                newUser.setLocale( (String) map.get("locale"));
                newUser.setPicture( (String) map.get("picture"));

                return newUser;
            });
            user.setLastVisit(LocalDateTime.now());
            return userDetailsRepo.save(user);
        };
    }
}
