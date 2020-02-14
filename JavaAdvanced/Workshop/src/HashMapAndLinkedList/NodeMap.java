package HashMapAndLinkedList;

public class NodeMap<K,V> {

    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.5;
    private int size;

    private NodeList[] buckets;

    NodeMap() {
        this.buckets = new NodeList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public boolean contains(K key) {
        V v = this.get(key);
        if (v != null) {
            return true;
        }
        return false;

    }

    public void put(K key, V value) {

        resizeWhenNeeded();

        // get bucket for key
        int bucketIdx = getBucketIndex(key);

        // if this bucket does not exist, initialize it with an empty list
        if (this.buckets[bucketIdx] == null) {
            this.buckets[bucketIdx] = new NodeList();
        }


        // get the bucket where our element should be added
        NodeList currentBucket = this.buckets[bucketIdx];

        Node<K,V> existing = currentBucket.getFirstElementWithKey(key);

        // there is no element with this key
        if (existing == null) {

            // increase size only when element is unique
            size++;

            // create object of type `Node` with key and value
            Node<K,V> nodeToPut = new Node<>(key, value);
            // add the element to the current bucket
            currentBucket.add(nodeToPut);

            return;
        }

        currentBucket.overrideElementWithKey(key, value);

    }

    private void resizeWhenNeeded() {
        // TODO(implement me, when you can get linked list elements)
    }

    public int getSize() {
        return this.size;
    }

    public V get(K key) {
        int bucketIdx = getBucketIndex(key);

        NodeList currentBucket = buckets[bucketIdx];

        if (currentBucket == null) {
            return null;
        }

        Node<K,V> node = currentBucket.getFirstElementWithKey(key);

        return node.value;

    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
}