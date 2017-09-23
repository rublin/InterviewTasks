package ua.com.softindex.map;

public class Pair {
    private final int key;
    private final long value;

    public Pair(int key, long value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public long getValue() {
        return value;
    }
}
