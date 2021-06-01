package org.practice.service.impl;

import org.practice.model.AttributeValue;
import org.practice.model.BooleanValue;
import org.practice.model.IntegerValue;
import org.practice.model.StringValue;
import org.practice.service.ParseAttributeService;

public class IntegerParseService implements ParseAttributeService {

    private ParseAttributeService nextParseService = null;

    @Override
    public AttributeValue getAttributeValueInstance(String value) {
        try{
            Integer val = Integer.parseInt(value);
            return new IntegerValue(val);
        }catch (Exception ex){
            return nextParseService.getAttributeValueInstance(value);
        }
    }

    @Override
    public void setNextParseService(ParseAttributeService parseAttributeService) {
        this.nextParseService = parseAttributeService;
    }
}
