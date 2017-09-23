package ua.com.softindex.map;

import java.util.Objects;

public class OpenAddressHashMap implements CustomMap {

    private static final int DEFAULT_TABLE_SIZE = 256;
    private Pair[] table;
    private int size;

    public OpenAddressHashMap() {
        init(DEFAULT_TABLE_SIZE);
    }

    public OpenAddressHashMap(int size) {
        init(size);
    }

    private void init(int size) {
        table = new Pair[size];
    }

    @Override
    public Long put(int key, long value) {
        int h = calculateHash(key);
        int i = 0;

        // All bucket are occupied. Need to create bigger table
        if (size == table.length) {
            moveTableToBigger(table.length * 2);
        }

        Pair pair = table[h];

        // The bucket is empty or contains the same key
        if (Objects.isNull(pair) || pair.getKey() == key) {
            table[h] = new Pair(key, value);
            size = Objects.isNull(pair) ? ++size : size;
            return Objects.isNull(pair) ? null : pair.getValue();
        }

        // The bucket is occupied. Need to find next empty bucket
        for (i = h + 1; i != h; i = (i + 1) % table.length) {
            pair = table[i];
            if (Objects.isNull(pair) || pair.getKey() == key) {
                table[i] = new Pair(key, value);
                size = Objects.isNull(pair) ? ++size : size;
                return Objects.isNull(pair) ? null : pair.getValue();
            }
        }
        return null;
    }

    @Override
    public Long get(int key) {
        int h = calculateHash(key);

        if (Objects.isNull(table[h])) {
            return null;
        }
        while (Objects.nonNull(table[h])) {
            if (table[h].getKey() == key) {
                return table[h].getValue();
            }
            h = (h + 1) % table.length;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private int calculateHash(int key) {
        return Math.abs(key) % table.length;
    }

    private void moveTableToBigger(int size) {
        Pair[] tmpTable = table;
        table = new Pair[size];
        this.size = 0;
        for (int i = 0; i < tmpTable.length; i++) {
            put(tmpTable[i].getKey(), tmpTable[i].getValue());
        }
    }
}
