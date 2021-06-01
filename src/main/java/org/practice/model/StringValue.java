package org.practice.model;

public class StringValue implements AttributeValue {

    private String attributeValue;


    public StringValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String getValue() {
        return attributeValue;
    }
}
