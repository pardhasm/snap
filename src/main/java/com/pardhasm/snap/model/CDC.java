package com.pardhasm.snap.model;

import lombok.Data;

@Data
public class CDC {
    private String eventID;
    private String eventName;
    private String eventVersion;
    private String eventSource;
    private String awsRegion;
    private String awsReventSourceARNegion;
    private DynamoDB dynamodb;
}
