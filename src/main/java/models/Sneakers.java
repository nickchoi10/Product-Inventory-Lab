package models;

public class Sneakers {

    private String name;
    private String sport;
    private Integer price;

    public Sneakers(String name, String sport, Integer price){
        this.name = name;
        this.sport = sport;
        this.price=price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    public String getSport(){
        return this.sport;
    }

    public void setPrice(Integer price){
        this.price = price;
    }
    public Integer getPrice(){
        return this.price;
    }
}
