package org.practice.service.impl;

import javafx.util.Pair;
import org.practice.model.AttributeValue;
import org.practice.model.MemoryStore;
import org.practice.model.Value;
import org.practice.service.MemoryStoreService;

import java.util.*;

public class MemoryStoreServiceImpl implements MemoryStoreService {

    private MemoryStore memoryStore;

    public MemoryStoreServiceImpl() {
        this.memoryStore = new MemoryStore();
    }

    @Override
    public void put(String key, List<Pair<String, String>> listOfAttributePairs) throws Exception {

        List<Value> values = new ArrayList<>();

        for(Pair<String, String> pair : listOfAttributePairs){
            ParseAttributeValue parseAttributeValue = new ParseAttributeValue(pair.getValue());
            AttributeValue attributeValue = parseAttributeValue.getAttributeValueInstance();
            Value value = new Value(pair.getKey(), attributeValue);
            matchAttributeInstanceWithPreviousInstance(pair.getKey(), attributeValue);
            values.add(value);
        }

        memoryStore.addValuesToStore(key, values);
        System.out.println("data stored for "+ key);


    }


    @Override
    public String get(String key){
          List<Value> values = memoryStore.getValues(key);
          if(values != null)
              return  values.toString();
          return  null;
    }

    @Override
    public void delete(String key){
           memoryStore.removeKey(key);
           System.out.println("data deleted for "+ key);
    }

    @Override
    public String keys(){
        Set<String> allkeys = memoryStore.getAllKeys();
        return allkeys.toString();
    }

    @Override
    public String search(String attributeKey, String attributeValue){

        Set<String> keys = new HashSet<>();
        for(Map.Entry<String, List<Value>> entry : memoryStore.getKeyValueStore().entrySet()){

            for(Value value : entry.getValue()){
                if(value.getAttributeKey().equals(attributeKey)
                        && attributeValue.equals(String.valueOf(value.getAttributeValue().getValue()))) {
                    keys.add(entry.getKey());
                    break;
                }
            }

        }

        return keys.toString();

    }

    private void matchAttributeInstanceWithPreviousInstance(String attributeKey, AttributeValue attributeValue) throws Exception {




        for(Map.Entry<String, List<Value>> entry : memoryStore.getKeyValueStore().entrySet()){
            for(Value value : entry.getValue()){
                if(value.getAttributeKey().equals(attributeKey)) {
                   if(value.isSameAtrriuteType(attributeValue))
                       return;
                   else
                       throw new Exception("Data Type Error");

                }
            }

        }




    }







}
