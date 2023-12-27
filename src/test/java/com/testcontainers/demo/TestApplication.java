package com.testcontainers.demo;

import org.springframework.boot.SpringApplication;

public class TestApplication {

  public static void main(String[] args) {
    SpringApplication
      .from(Application::main)
//  Comment the next line to use the container from the build.
      .with(ContainersConfig.class)
      .run(args);
  }
}
