package utils;

import java.util.HashMap;

/**
 * Utility class for managing frequency maps (HashMaps with integer counts).
 * Eliminates duplicated HashMap.getOrDefault() and increment/decrement patterns.
 */
public class FrequencyMap<K> {
    private HashMap<K, Integer> map;
    
    public FrequencyMap() {
        this.map = new HashMap<>();
    }
    
    /**
     * Increment the frequency of a key by 1
     */
    public void increment(K key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
    
    /**
     * Decrement the frequency of a key by 1
     */
    public void decrement(K key) {
        map.put(key, map.get(key) - 1);
    }
    
    /**
     * Get the frequency of a key (returns 0 if not present)
     */
    public int get(K key) {
        return map.getOrDefault(key, 0);
    }
    
    /**
     * Check if the map contains a key
     */
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }
    
    /**
     * Remove a key from the map
     */
    public void remove(K key) {
        map.remove(key);
    }
    
    /**
     * Get the size of the map (number of unique keys)
     */
    public int size() {
        return map.size();
    }
    
    /**
     * Get the underlying HashMap
     */
    public HashMap<K, Integer> getMap() {
        return map;
    }
}
