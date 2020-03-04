package greedyTimes;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
   private GemContainer gemContainer;
   private Gold gold;
   private CashContainer cashContainer;
   private long capacity;
   public Bag(long capacity){
       this.cashContainer = new CashContainer();
       this.gemContainer = new GemContainer();
       this.gold = new Gold(50);
       this.capacity = capacity;
   }

   public boolean hasRoomFor(Long value){
       return value + this.getCurrentSize() <= this.capacity;
   }

    private Long getCurrentSize() {
       long size = this.gold.getValue();
       size += this.cashContainer.getSize();
       size += this.gemContainer.getSize();
       return size;
    }
    public void addGold(long value){
       this.gold.addValue(value);
    }
    public void addGem(String item,long value){
       if (this.gold.getValue() >= (this.gemContainer.getSize() + value)){
           this.gemContainer.putGemInGemContainer(item, value);
       }
    }
    public void addCash(String item,long value){
        if (this.gold.getValue() >= (this.cashContainer.getSize() + value)){
            if (this.gemContainer.getSize() >= (this.cashContainer.getSize() + value)){
                this.cashContainer.puCashInCashContainer(item, value);
            }
        }

    }



    public String report(){
       StringBuilder sb = new StringBuilder();
       sb.append(String.format("<Gold> $%d",this.gold.getValue()));
       sb.append(System.lineSeparator());
       sb.append(String.format("##Gold - %d",this.gold.getValue()));
       sb.append(System.lineSeparator());
       if (!this.gemContainer.getGemMap().isEmpty()){
           sb.append(String.format("<Gem> $%d",GemContainer.getTotalValues()));
           sb.append(System.lineSeparator());
           this.gemContainer.getGemMap().entrySet().stream().
                   sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> sb.append(String.format("##%s - %d%n",i.getKey(),i.getValue())));
       }
        if (!this.cashContainer.getCashMap().isEmpty()){
            sb.append(String.format("<Cash> $%d",CashContainer.getTotalValues()));
            sb.append(System.lineSeparator());
            this.cashContainer.getCashMap().entrySet().stream().
                    sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> sb.append(String.format("##%s - %d%n",i.getKey(),i.getValue())));
        }
       return sb.toString();
    }
}
