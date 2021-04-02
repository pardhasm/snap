package com.pardhasm.snap.service;

import com.amazonaws.services.dynamodbv2.document.ItemUtils;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.pardhasm.snap.model.CDC;
import com.pardhasm.snap.model.InCredAttributeValue;
import com.pardhasm.snap.util.AttributeMapper;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class TestService {

    public Map<String, Object> test(CDC cdc){
        HashMap<String, InCredAttributeValue> oldImage = cdc.getDynamodb().getOldImage();
        HashMap<String, AttributeValue> coreAttributes = new HashMap<>();
        for(Map.Entry<String, InCredAttributeValue> e : oldImage.entrySet()){
            coreAttributes.put(e.getKey(), AttributeMapper.toCore(e.getValue()));
        }
        return ItemUtils.toItem(coreAttributes).asMap();
    }
}
