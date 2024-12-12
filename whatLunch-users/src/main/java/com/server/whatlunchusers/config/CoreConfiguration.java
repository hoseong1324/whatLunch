package com.server.whatlunchusers.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.server.whatlunchcore.users.entity"})
@EnableJpaRepositories(basePackages = {"com.server.whatlunchcore.users.repo"})
public class CoreConfiguration {
}
