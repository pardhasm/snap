package com.pardhasm.snap.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ApproximateCreationDateTime",
        "Keys",
        "NewImage",
        "OldImage",
        "SequenceNumber",
        "SizeBytes",
        "StreamViewType"
})
@Generated("jsonschema2pojo")
@Data
public class DynamoDB {

    @JsonProperty("ApproximateCreationDateTime")
    private Integer approximateCreationDateTime;
    @JsonProperty("Keys")
    private HashMap<String, InCredAttributeValue> keys;
    @JsonProperty("NewImage")
    private HashMap<String, InCredAttributeValue> newImage;
    @JsonProperty("OldImage")
    private HashMap<String, InCredAttributeValue> oldImage;
    @JsonProperty("SequenceNumber")
    private String sequenceNumber;
    @JsonProperty("SizeBytes")
    private Integer sizeBytes;
    @JsonProperty("StreamViewType")
    private String streamViewType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}