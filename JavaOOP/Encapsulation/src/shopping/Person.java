package shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name,double money){
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct (Product product){

        if (this.money < product.getCost()){
            throw new IllegalArgumentException(String.format("%s can't afford %s",this.name,product.getName()));
        }
        this.products.add(product);
        this.setMoney(this.money - product.getCost());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + " - ");
        if (!this.products.isEmpty()){
            sb.append(this.products.toString().replaceAll("[\\[\\]]",""));

        }else {
            sb.append("Nothing bought");
        }

        return sb.toString();
    }
}
