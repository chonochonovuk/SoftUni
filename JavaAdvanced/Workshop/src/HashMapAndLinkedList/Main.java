package HashMapAndLinkedList;

public class Main {
    public static void main(String[] args) {
        NodeMap<String,Integer> myMap = new NodeMap<>();
        myMap.put("Jackie",69);
        myMap.put("Jackie",115);
        myMap.put("Katie",23);
        myMap.put("Elena",105);
        System.out.println(myMap.get("Jackie"));
    }
}
