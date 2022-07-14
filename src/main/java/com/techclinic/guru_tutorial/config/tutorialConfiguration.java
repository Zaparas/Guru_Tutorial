package com.techclinic.guru_tutorial.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("tutorial")
@Configuration
public class tutorialConfiguration {

    private String username;
    private String password;
    private String databaseLink;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseLink() {
        return databaseLink;
    }

    public void setDatabaseLink(String databaseLink) {
        this.databaseLink = databaseLink;
    }
}
