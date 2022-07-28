package service;

import models.MedicalDevices;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MedicalDeviceServiceTest {

    MedicalDeviceService service = new MedicalDeviceService();
    MedicalDevices device1 = service.create("Stryker", 2000);
    MedicalDevices device2 = service.create("ProWolf", 1000);
    MedicalDevices device3 = service.create("Storz", 1);
    MedicalDevices device4 = service.create("Zeiss Medical", 1000);
    MedicalDevices device5 = service.create("Intuitive", 1000);

    @Test
    public void createTest(){
        String expectedCompany = "Stryker";
        int expectedPrice = 100;

        MedicalDeviceService service = new MedicalDeviceService();
        MedicalDevices device = service.create(expectedCompany,expectedPrice);

        int actualId = device.getId();

        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedCompany, device.getCompany());
        Assert.assertEquals(expectedPrice, device.getPrice());
    }


    @Test
    public void findMedicalDeviceTest() {

        String expected1 = service.findMedicalDevice(1).getCompany();
        String expected2 = service.findMedicalDevice(2).getCompany();

        String actual1= "Stryker";
        String actual2= "ProWolf";

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);



    }

    @Test
    public void findAllTest() {
        MedicalDevices[] result = service.findAll();
        Assert.assertEquals(5,result.length);

    }

    @Test
    public void deleteTest() {
        service.delete(1);
        service.delete(2);
        Assert.assertEquals(3,service.findAll().length);
    }




}