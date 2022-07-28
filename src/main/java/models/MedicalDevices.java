package models;

public class MedicalDevices {


    private int Id;
    private String company;
    private int price;

    public MedicalDevices(int Id,String company, int price){
        this.company= company;
        this.price= price;
        this.Id = Id;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return this.company;
    }


    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
