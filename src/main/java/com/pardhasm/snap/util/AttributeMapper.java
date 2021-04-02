package com.pardhasm.snap.util;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.pardhasm.snap.model.InCredAttributeValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AttributeMapper {

    public static AttributeValue toCore(InCredAttributeValue inCredAttributeValue){
        if(inCredAttributeValue.getB() != null){
            return new AttributeValue().withB(inCredAttributeValue.getB());
        }
        if(inCredAttributeValue.getS() != null){
            return new AttributeValue().withS(inCredAttributeValue.getS());
        }
        if(inCredAttributeValue.getN() != null){
            return new AttributeValue().withN(inCredAttributeValue.getN());
        }
        if(inCredAttributeValue.getSS() != null){
            return new AttributeValue().withSS(inCredAttributeValue.getSS());
        }
        if(inCredAttributeValue.getNS() != null){
            return new AttributeValue().withNS(inCredAttributeValue.getNS());
        }
        if(inCredAttributeValue.getBS() != null){
            return new AttributeValue().withBS(inCredAttributeValue.getBS());
        }
        if(inCredAttributeValue.getNULL() != null){
            return new AttributeValue().withNULL(inCredAttributeValue.getNULL());
        }
        if(inCredAttributeValue.getBOOL() != null){
            return new AttributeValue().withBOOL(inCredAttributeValue.getBOOL());
        }
        if(inCredAttributeValue.getL() != null){
            List<AttributeValue> list = inCredAttributeValue.getL().stream().map(AttributeMapper::toCore).collect(Collectors.toList());
            return new AttributeValue().withL(list);
        }
        if(inCredAttributeValue.getM() != null){
            Map<String, AttributeValue> attributeValueMap = new HashMap<>();
            inCredAttributeValue.getM().forEach((key, value) -> attributeValueMap.put(key, toCore(value)));
            return new AttributeValue().withM(attributeValueMap);
        }
        return null;
    }
}
