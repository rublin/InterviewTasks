package soft_index.map;

public interface CustomMap {

    boolean put(int key, long value);

    long get(int key);

    int size();
}
