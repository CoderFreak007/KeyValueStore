package org.practice.service.impl;

import org.practice.model.AttributeValue;
import org.practice.model.IntegerValue;
import org.practice.service.ParseAttributeService;

public class ParseAttributeValue {

    private String value;

    private ParseAttributeService fisrtParseService = new IntegerParseService();


    public ParseAttributeValue(String value) {
        this.value = value;
    }

    public AttributeValue getAttributeValueInstance(){
        fisrtParseService.setNextParseService(new BooleanParseService());
        return fisrtParseService.getAttributeValueInstance(value);

    }
}
