package models;

public class MedicalDevices {

    private String company;
    private int price;

    public MedicalDevices(String company, int price){
        this.company= company;
        this.price= price;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return this.company;
    }


    public void setPrice(Integer price){
        this.price=price;
    }
    public Integer getPrice(){
        return price;
    }
}
