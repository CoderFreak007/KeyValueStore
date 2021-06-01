package org.practice.model;

public class BooleanValue implements AttributeValue {

    private Boolean attributeValue;

    public BooleanValue(Boolean attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public Boolean getValue() {
        return attributeValue;
    }

}
