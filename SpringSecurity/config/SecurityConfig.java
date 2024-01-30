package com.example.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // configuration 1
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
//        return httpSecurity
//                .authorizeHttpRequests()
//                    .requestMatchers("v1/index2").permitAll() //todos los endpoints que no requieren autorización
//                    .anyRequest().authenticated()
//                .and()
//                .formLogin().permitAll()
//                .and()
//                .build();
//    }
//    configuration 2
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        //System.out.println(httpSecurity.build());
        return httpSecurity
                .authorizeHttpRequests( auth -> {
                    auth.requestMatchers("v1/index2").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin().permitAll()
                    .successHandler(successHandler()) // URL donde se dirige después de iniciar session
                    .permitAll()
                .and()
                .sessionManagement() // gestión de session de users
                    .sessionCreationPolicy(SessionCreationPolicy.ALWAYS) // ALWAYS - IF_REQUIRED - NEVER - STATELESS
                    .invalidSessionUrl("/login")
                    .maximumSessions(1)
                    .expiredUrl("/login")
                    .sessionRegistry(sessionRegistry())
                .and()
                .sessionFixation()
                    .migrateSession() // migrateSession - newSession - noneSession
                .and()
                .build();
    }

    public AuthenticationSuccessHandler successHandler() {
        return ((request, response, authentication) -> {
            response.sendRedirect("v1/session");
        });
    }
    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

}
