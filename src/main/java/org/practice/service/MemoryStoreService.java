package org.practice.service;

import javafx.util.Pair;

import java.util.List;

public interface MemoryStoreService {

    public void put(String key, List<Pair<String, String>> listOfAttributePairs) throws Exception;

    public String get(String key);

    public void delete(String key);

    public String search(String attributeKey, String attributeValue);

    public String keys();

}
