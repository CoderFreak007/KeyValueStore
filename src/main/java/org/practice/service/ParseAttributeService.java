package org.practice.service;

import org.practice.model.AttributeValue;

public interface ParseAttributeService {

    public AttributeValue getAttributeValueInstance(String value);

    public void setNextParseService(ParseAttributeService parseAttributeService);
}
