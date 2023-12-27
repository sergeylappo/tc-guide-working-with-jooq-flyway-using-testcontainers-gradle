package com.testcontainers.demo;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

// You can comment out/remove the whole file if you reuse testcontainers from the build configuration.
@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfig {

  @Bean
  @ServiceConnection
  @RestartScope
  PostgreSQLContainer<?> postgreSQLContainer() {
    return new PostgreSQLContainer<>("postgres:16-alpine");
  }
}
