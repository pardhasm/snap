package com.pardhasm.snap.util;

import com.amazonaws.services.dynamodbv2.document.ItemUtils;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.*;

public class DynamoJsonConverter {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static void init() throws JsonProcessingException {
        String newItm = "{\"EXECUTION_TYPE\":{\"s\":\"Automatic\"},\"TASK\":{\"m\":{\"output\":{\"l\":[{\"s\":\"Complete\"}]},\"customer_task_list\":{\"s\":\"{\\\"PL_DSA_INSTANT\\\":[\\\"100\\\"]}\"},\"product\":{\"s\":\"PL_DSA_INSTANT\"},\"code\":{\"s\":\"PLDSA217.4\"},\"latestVersion\":{\"bool\":true},\"on_status_false\":{\"s\":\"{\\\"STATUS\\\":\\\"Waiting_On_Customer_Task\\\"}\"},\"function\":{\"s\":\"SYS_CUSTOMER_TASK_CHECK\"},\"execution_type\":{\"s\":\"Automatic\"},\"execution_logic\":{\"s\":\"ANY\"},\"version\":{\"n\":\"3\"},\"desc\":{\"s\":\"PLDSA - Selfi check\"}}},\"APPLICATION_ID\":{\"s\":\"4955544486161074A\"},\"ROLE_NAME\":{\"s\":\"SYSTEM\"},\"PRODUCT_ID\":{\"s\":\"PL_DSA_INSTANT\"},\"PINCODE\":{\"s\":\"110033\"},\"PERSONNEL_ID\":{\"s\":\"system@incred.com\"},\"ORIGIN\":{\"l\":[{\"m\":{\"EPOCH\":{\"n\":\"1617298496946\"},\"TASK_ID\":{\"s\":\"PLDSA337.4\"}}}]},\"STATUS\":{\"s\":\"Waiting_On_Customer_Task\"},\"TASK_OUTPUT\":{\"m\":{\"COMMENT\":{\"s\":\"{\\\"status\\\":false,\\\"response\\\":{\\\"COMMENT\\\":\\\"Waiting on Customer Task (100:Verify your identity)\\\"}}\"}}},\"EPOCH\":{\"n\":\"1617298498154\"},\"PARTNER_ID\":{\"s\":\"7016000823651022P\"},\"TASK_ID\":{\"s\":\"PLDSA217.4\"}}";
        Map<String, Object> jsonString = convertToMap(newItm);
    }

    private static Map<String, Object> convertToMap(String newItem) throws JsonProcessingException {
        HashMap<String,AttributeValue> attributes =objectMapper.readValue(newItem, new TypeReference<HashMap<String,AttributeValue>>() {});
        return ItemUtils.toItem(attributes).asMap();
    }
}
