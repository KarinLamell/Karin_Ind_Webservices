package com.lamell.karin_ind_webservices;

import com.lamell.karin_ind_webservices.services.JwtAuthConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Autowired
    private JwtAuthConverter jwtAuthConverter;

    @Bean
    protected SessionAuthenticationStrategy strategy(){
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated();

       http
               .oauth2ResourceServer()
               .jwt()
               .jwtAuthenticationConverter(jwtAuthConverter);

       http
               .sessionManagement()
               .sessionCreationPolicy(STATELESS);

        return http.build();
    }

    //jwt.auth.converter.resource-id



/*
                        .antMatchers("/posts/{id}").hasRole("ENHANCED","PREMIUM","ADMIN")
                        .antMatchers("/newpost").hasRole("ENHANCED","PREMIUM","ADMIN")
                        .antMatchers("/updatepost/{id}").hasRole("PREMIUM", "ADMIN")
                        .antMatchers("/deletepost/{id}").hasRole("PREMIUM", "ADMIN")
                        .antMatchers("newuser").permitAll()
                        .antMatchers("users").hasRole("ADMIN")
                        .antMatchers("users/{id}").hasRole("ADMIN")
                .and()/*formLogin()
               .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/home");
                .httpBasic());

    }*/


       /* auth.inMemoryAuthentication()
                .withUser("karin")
                .password("pass")
                .roles("USER")
                .and()
                .withUser("johanna")
                .roles("ENHANCED")
                .password("1234")
                .and()
                .withUser("sara")
                .roles("PREMIUM")
                .password("8828")
                .and()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN");
    }*/

    /*@Bean
    public PasswordEncoder getPasswordEncoder() {return ExampleMatcher.NoOpPassWordEncoder.getInstance();
    }   //kringgår kryptering av lösenord*/


}
