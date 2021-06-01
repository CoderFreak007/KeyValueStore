package org.practice.service.impl;

import org.practice.model.AttributeValue;
import org.practice.model.BooleanValue;
import org.practice.model.StringValue;
import org.practice.service.ParseAttributeService;

public class BooleanParseService implements ParseAttributeService {

    private ParseAttributeService nextParseService = null;

    @Override
    public AttributeValue getAttributeValueInstance(String value) {

           if(value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false"))
            return new BooleanValue(Boolean.valueOf(value));
           else {
            return new StringValue(value);
        }

    }

    @Override
    public void setNextParseService(ParseAttributeService parseAttributeService) {
        this.nextParseService = parseAttributeService;
    }
}
