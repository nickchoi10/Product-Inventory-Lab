package service;

import models.MedicalDevices;

import java.util.ArrayList;
import java.util.List;

public class MedicalDeviceService {
    private int nextId=1;

    List<MedicalDevices> inventory = new ArrayList<>();

    public MedicalDevices create(String company, int price){
        MedicalDevices device = new MedicalDevices(nextId++,company ,price);

        inventory.add(device);
        return device;
    }


    public MedicalDevices findMedicalDevice (int id){
        for(MedicalDevices a :inventory){
            if(a.getId()== id ){
                return a;
            }
        }
        return null;
    }

    public MedicalDevices[] findAll(){
        return inventory.toArray(new MedicalDevices[inventory.size()]);
    }

    public boolean delete(int id){
        for(MedicalDevices a : inventory){
            if (a.getId()== id){
                inventory.remove(a);
                return true;
            }
        }
        return false;
    }

}
