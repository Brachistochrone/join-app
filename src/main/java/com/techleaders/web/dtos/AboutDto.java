package com.techleaders.web.dtos;

public class AboutDto {

    private final String appName;
    private final String version;
    private final String createdBy;

    public AboutDto(String appName, String version, String createdBy) {
        this.appName = appName;
        this.version = version;
        this.createdBy = createdBy;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public String getCreatedBy() {
        return createdBy;
    }
}
