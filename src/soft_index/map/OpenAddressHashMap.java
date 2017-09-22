package soft_index.map;

import java.util.Objects;

public class OpenAddressHashMap implements CustomMap {

    private Pair[] table;
    private int size;

    public OpenAddressHashMap() {
        table = new Pair[1000];
    }

    @Override
    public boolean put(int key, long value) {
        int h = calculateHash(key);
        try {
            Pair pair = table[key];
            if (Objects.isNull(pair)) {
                table[key] = new Pair(key, value);
                size++;
                return true;
            }
//            for (int i = key + 1)
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public long get(int key) {
        return Objects.isNull(table[key]) ? null : table[key].getValue();
    }

    @Override
    public int size() {
        return size;
    }

    // ToDo implement this method
    private int calculateHash(int key) {
        return 0;
    }

    /*
    public boolean push(T1 x, T2 y) {
        int h = returnHash(x);
        int i=0;
        try{
            if (table[h].isDeleted() ) {
                table[h] = new Pair(x, y);
                return true;
            }
            for (i = h + 1; i != h; i = (i + 1) % table.length) {
                if (table[i].isDeleted() || table[i].getKey() == x) {
                    table[i] = new Pair(x, y);
                    return true;
                }
            }
            return false;
        } catch(NullPointerException e) {
            table[h] = new Pair(x, y);
            return true;
        }
    }

    public boolean delete(T1 x) {
        int h = returnHash(x);
        try{
            if (table[h].getKey() == x) {
                table[h].deletePair();
                return true;
            }
            for (int i = h + 1; i != h; i = (i + 1) % table.length) {
                if (table[i].getValue() == x && !table[i].isDeleted()) {
                    table[i].deletePair();
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }
    */
}
