package org.practice.model;

public class IntegerValue implements AttributeValue {

    private Integer attributeValue;

    public IntegerValue(Integer attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public Integer getValue() {
        return attributeValue;
    }
}
