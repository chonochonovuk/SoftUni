public class NodeList {

    private Node firstElement;

    public void add(Node node) {

        if (firstElement == null) {
            firstElement = node;
            return;
        }

        Node currentNode = firstElement;
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
        Node currentNode = firstElement;
        while (currentNode != null) {
            sb.append("{");
            sb.append(currentNode.toString());
            sb.append("}");
            sb.append(",");
            currentNode = currentNode.next;
        }
        return sb.toString();

    }

    public Node getFirstElementWithKey(String key) {

        Node currentNode = firstElement;

        while (currentNode != null) {
            if (key.equals(currentNode.key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;

    }

    // only works if they key exists, otherwise does nothing
    public void overrideElementWithKey(String key, String value) {

        if (firstElement == null) {
            return;
        }

        Node nodeToReplaceWith = new Node(key, value);

        if (key.equals(firstElement.key)) {
            nodeToReplaceWith.next = firstElement.next;
            firstElement = nodeToReplaceWith;
            return;
        }

        Node currentNode = firstElement;
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
