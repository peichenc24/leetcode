class MyHashMap {

    private int[] hash;
public MyHashMap() {
    this.hash = new int[1000001]; // Initialize an integer array 'hash' with a size of 1000001.
    Arrays.fill(hash, -1); // Fill the 'hash' array with -1, indicating that no key-value pairs have been stored yet.
}

public void put(int key, int value) {
    hash[key] = value; // Assign the 'value' to the 'key' index in the 'hash' array to store the key-value pair.
}

public int get(int key) {
    return hash[key]; // Retrieve the value associated with the given 'key' from the 'hash' array.
}

public void remove(int key) {
    hash[key] = -1; // Remove the key-value pair associated with the given 'key' by setting its value to -1.
}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
