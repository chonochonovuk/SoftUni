public class NodeMap {

    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.5;
    private int size;

    private NodeList[] buckets;

    NodeMap() {
        this.buckets = new NodeList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public boolean contains(String key) {
        String node = this.get(key);
        if (node != null) {
            return true;
        }
        return false;

    }

    public void put(String key, String value) {

        resizeWhenNeeded();

        // get bucket for key
        int bucketIdx = getBucketIndex(key);

        // if this bucket does not exist, initialize it with an empty list
        if (this.buckets[bucketIdx] == null) {
            this.buckets[bucketIdx] = new NodeList();
        }


        // get the bucket where our element should be added
        NodeList currentBucket = this.buckets[bucketIdx];

        Node existing = currentBucket.getFirstElementWithKey(key);

        // there is no element with this key
        if (existing == null) {

            // increase size only when element is unique
            size++;

            // create object of type `Node` with key and value
            Node nodeToPut = new Node(key, value);
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

    public String get(String key) {
        int bucketIdx = getBucketIndex(key);

        NodeList currentBucket = buckets[bucketIdx];

        if (currentBucket == null) {
            return null;
        }

        Node node = currentBucket.getFirstElementWithKey(key);

        return node.value;

    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
}