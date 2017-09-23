package ua.com.softindex.map;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class OpenAddressHashMapTest {

    @Test
    public void put() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap();
        Long put = map.put(1, 1L);
        assertTrue(Objects.isNull(put));
        put = map.put(-2, 1L);
        assertTrue(Objects.isNull(put));
        put = map.put(-1, 1L);
        assertTrue(Objects.isNull(put));

        put = map.put(1, 2L);
        assertEquals(Long.valueOf(1), put);
    }

    @Test
    public void get() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap();
        map.put(1, 1L);
        map.put(-2000, 2L);

        assertEquals(Long.valueOf(1), map.get(1));
        assertEquals(Long.valueOf(2), map.get(-2000));
        assertTrue(Objects.isNull(map.get(3)));

        map.put(1, 11L);
        assertEquals(Long.valueOf(11), map.get(1));
    }

    @Test
    public void size() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap();
        assertEquals(0, map.size());

        map.put(1, 1L);
        assertEquals(1, map.size());

        map.put(2, 2L);
        assertEquals(2, map.size());

        map.put(2, 3L);
        assertEquals(2, map.size());

        map.put(-1, 1L);
        assertEquals(3, map.size());
    }
    @Test
    public void bigSize() {
        OpenAddressHashMap map = new OpenAddressHashMap();

        for (int i = 0; i < 1000; i++) {
            map.put(i, 1L+i);
        }
        assertEquals(1000, map.size());
    }
}