package org.practice.model;

import javafx.util.Pair;

public class Value {

    private String attributeKey;

    private AttributeValue attributeValue;

    public Value(String attributeKey, AttributeValue attributeValue) {
        this.attributeKey = attributeKey;
        this.attributeValue = attributeValue;
    }

    public String getAttributeKey() {
        return attributeKey;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }
    public boolean isSameAtrriuteType(AttributeValue attributeValue) {
        return attributeValue.getClass().equals(this.attributeValue.getClass());
    }

    @Override
    public String toString() {
        return attributeKey + ":" + attributeValue.getValue();
    }
}
