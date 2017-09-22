package soft_index.map;

public interface CustomMap {

    Long put(int key, long value);

    Long get(int key);

    int size();
}
