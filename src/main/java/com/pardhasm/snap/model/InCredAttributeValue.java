package com.pardhasm.snap.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InCredAttributeValue {
    @JsonProperty("S")
    private String S;
    @JsonProperty("N")
    private String N;
    @JsonProperty("B")
    private ByteBuffer B;
    @JsonProperty("SS")
    private List<String> SS;
    @JsonProperty("NS")
    private List<String> NS;
    @JsonProperty("BS")
    private List<ByteBuffer> BS;
    @JsonProperty("M")
    private LinkedHashMap<String, InCredAttributeValue> M;
    @JsonProperty("L")
    private List<InCredAttributeValue> L;
    @JsonProperty("NULL")
    private Boolean NULL;
    @JsonProperty("BOOL")
    private Boolean BOOL;
}
