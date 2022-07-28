package models;

public class Sneakers {
    private int Id;
    private String name;
    private String sport;
    private int price;

    public Sneakers(){

    }

    public Sneakers(int Id, String name, String sport, int price){
        this.Id = Id;
        this.name = name;
        this.sport = sport;
        this.price=price;
    }

    public void setId(int id){ this.Id = id;}
    public Integer getId(){ return Id;}
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return sport;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
