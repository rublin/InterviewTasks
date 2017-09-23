package soft_index.map;

/**
 * Custom HashMap with open addressing strategy
 */
public interface CustomMap {

    /**
     * Associates the specified {@link Long} value with the specified {@link Integer} key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     */
    Long put(int key, long value);

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     */
    Long get(int key);

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    int size();
}
