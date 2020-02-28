package greedyTimes;

import java.util.Iterator;
import java.util.Map;

public class Treasure implements Iterable<Treasure.Pair<String,Long>>{

    public static class Pair<K,V>{
        private K first;
        private V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;

        }

        public K getFirst() {
            return first;
        }


        public V getSecond() {
            return second;
        }

    }

    private String[] treasure;
    public Treasure(String[] treasure){
        this.treasure = treasure;
    }

    @Override
    public Iterator<Treasure.Pair<String, Long>> iterator() {

        return new Iterator<Treasure.Pair<String, Long>>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < treasure.length;
            }

            @Override
            public Treasure.Pair<String, Long> next() {
                String item = treasure[index++];
                long value = Long.parseLong(treasure[index++]);
                return new Treasure.Pair<>(item,value);
            }
        };
    }
}
