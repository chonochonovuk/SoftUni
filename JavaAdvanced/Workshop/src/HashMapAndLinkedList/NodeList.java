package HashMapAndLinkedList;

public class NodeList<K,V> {

    private Node<K,V> firstElement;

    public void add(Node<K,V> node) {

        if (firstElement == null) {
            firstElement = node;
            return;
        }

        Node<K,V> currentNode = firstElement;
        while (true) {
            if (currentNode.next == null) {
                currentNode.next = node;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public String toString() {
        if (firstElement == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        Node<K,V> currentNode = firstElement;
        while (currentNode != null) {
            sb.append("{");
            sb.append(currentNode.toString());
            sb.append("}");
            sb.append(",");
            currentNode = currentNode.next;
        }
        return sb.toString();

    }

    public Node<K,V> getFirstElementWithKey(K key) {

        Node<K,V> currentNode = firstElement;

        while (currentNode != null) {
            if (key.equals(currentNode.key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;

    }

    // only works if they key exists, otherwise does nothing
    public void overrideElementWithKey(K key, V value) {

        if (firstElement == null) {
            return;
        }

        Node<K,V> nodeToReplaceWith = new Node(key, value);

        if (key.equals(firstElement.key)) {
            nodeToReplaceWith.next = firstElement.next;
            firstElement = nodeToReplaceWith;
            return;
        }

        Node<K,V> currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.next != null && currentNode.next.key.equals(key)) {
                nodeToReplaceWith.next = currentNode.next.next;
                currentNode.next = nodeToReplaceWith;
                return;
            }
            currentNode = currentNode.next;
        }
    }
}
