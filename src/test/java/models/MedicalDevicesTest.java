package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalDevicesTest {

    @Test
    public void setCompanyTest(){
        String expected = "stryker";

        MedicalDevices med = new MedicalDevices(1,null,1);
        med.setCompany(expected);

        Assert.assertEquals(expected,med.getCompany());
    }

    @Test
    public void setPriceTest(){
        int expected = 100;

        MedicalDevices med = new MedicalDevices(1,null,1);
        med.setPrice(expected);

        Assert.assertEquals(expected,med.getPrice());
    }

    @Test
    public void constructorTest(){
        String expectedCompany = "Stryker";
        int expectedPrice = 1000;
        int expectedId =1;

        MedicalDevices dev = new MedicalDevices(expectedId,expectedCompany,expectedPrice);

        Assert.assertEquals(expectedCompany, dev.getCompany());
        Assert.assertEquals(expectedPrice, dev.getPrice());

    }

}