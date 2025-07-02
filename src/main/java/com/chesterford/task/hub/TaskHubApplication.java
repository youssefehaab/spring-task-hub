package com.chesterford.task.hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@EnableAutoConfiguration
@ConfigurationPropertiesScan
public class TaskHubApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaskHubApplication.class);
  }

}
