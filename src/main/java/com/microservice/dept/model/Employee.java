package com.microservice.dept.model;

// Java 17 feature,
public record Employee( Long eId, Long dId, String eName, int eAge, String position) {
}
