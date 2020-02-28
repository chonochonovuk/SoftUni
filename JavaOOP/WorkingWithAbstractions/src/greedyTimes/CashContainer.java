package greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;


public class CashContainer {
    private Map<String,Long> cashMap;
    private static long totalValues = 0;

    public CashContainer() {
        this.cashMap = new LinkedHashMap<>();
    }

    public long getSize(){
        return this.cashMap.values()
                .stream()
                .mapToLong(e -> e)
                .sum();
    }
    public void puCashInCashContainer(String item,long value){
        this.cashMap.put(item,value);
        totalValues += value;
    }

    public Map<String, Long> getCashMap() {
        return cashMap;
    }

    public static long getTotalValues() {
        return totalValues;
    }
}
