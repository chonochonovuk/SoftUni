package greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GemContainer {
    private Map<String,Long> gemMap;
    private static long totalValues = 0;

    public GemContainer() {
        this.gemMap = new LinkedHashMap<>();
    }

    public long getSize(){
        return this.gemMap.values()
                .stream()
                .mapToLong(e -> e)
                .sum();
    }

    public Map<String, Long> getGemMap() {
        return gemMap;
    }

    public void putGemInGemContainer(String item, long value) {
        this.gemMap.put(item,value);
        totalValues += value;
    }

    public static long getTotalValues() {
        return totalValues;
    }


}
