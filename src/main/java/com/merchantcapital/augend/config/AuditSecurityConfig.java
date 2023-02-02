package com.merchantcapital.augend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@Configuration
//@EnableJpaAuditing
public class AuditSecurityConfig {
/*    @Bean
    AuditorAware<User> auditorAware(AuthorRepository repo) {
        // Lookup Author instance corresponding to logged in user
        return () -> Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication)
                .filter(Authentication::isAuthenticated)
                .map(Authentication::getName)
                .flatMap(repo::findByName);
    }*/
}