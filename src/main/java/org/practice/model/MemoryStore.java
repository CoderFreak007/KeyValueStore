package org.practice.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MemoryStore {

   private Map<String, List<Value>> keyValueStore;



    public MemoryStore() {
        keyValueStore = new HashMap<>();
    }

    public Map<String, List<Value>> getKeyValueStore() {
        return keyValueStore;
    }

    private boolean isKeyPresentInStore(String key){
        return keyValueStore.containsKey(key);
    }

    public void addValuesToStore(String key, List<Value> values){
        keyValueStore.put(key, values);
    }

    public List<Value> getValues(String key){
        return keyValueStore.get(key);
    }

    public void removeKey(String key){
         keyValueStore.remove(key);
    }

    public Set<String> getAllKeys(){
        return keyValueStore.keySet();
    }


}
