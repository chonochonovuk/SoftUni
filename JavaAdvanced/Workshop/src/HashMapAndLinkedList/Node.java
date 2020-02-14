package HashMapAndLinkedList;

public class Node<K,V> {

    final K key;
    final V value;
    Node<K,V> next = null;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return "k: " + key + " v: " + value;
    }

}
