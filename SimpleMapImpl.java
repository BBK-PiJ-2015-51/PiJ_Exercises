public class SimpleMapImpl implements SimpleMap {

private final static int TABLE_SIZE = 1000;

MapEntry[] map;


SimpleMapImpl() {

map = new MapEntry[TABLE_SIZE];

}

public void put(int key, String name) {
	int hash = (key % TABLE_SIZE);
    while (map[hash] != null && map[hash].getKey() != key) {
    	 hash = (hash + 1) % TABLE_SIZE;
    }
    map[hash] = new MapEntry(key, name);
}

public String get(int key) {
	int hash = (key % TABLE_SIZE);
    while (map[hash] != null && map[hash].getKey() != key) {
    	hash = (hash + 1) % TABLE_SIZE;
    }
    if (map[hash] == null) {
    	return "no value";
    } else {
    	return map[hash].getName();
    }
                  
}

public void remove(int key) {
int hash = (key % TABLE_SIZE);
    while (map[hash] != null && map[hash].getKey() != key) {
    	hash = (hash + 1) % TABLE_SIZE;
    }
map[hash] = null;

}

public boolean isEmpty() {
if(map == null) {
	return true;
} else {
	return false;
}


}
}





