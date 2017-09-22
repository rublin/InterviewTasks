package soft_index.map;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class OpenAddressHashMapTest {

    @Test
    public void put() throws Exception {
        OpenAddressHashMap map = new OpenAddressHashMap();
        Long put = map.put(1, 1L);
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

        Long result = map.get(1);
        assertEquals(Long.valueOf(1), result);

        result = map.get(2);
        assertTrue(Objects.isNull(result));
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
    }

}