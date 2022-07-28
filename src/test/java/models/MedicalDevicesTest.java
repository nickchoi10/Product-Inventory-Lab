package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalDevicesTest {

    @Test
    public void setCompanyTest(){
        String expected = "stryker";

        MedicalDevices med = new MedicalDevices();
        med.setCompany(expected);

        Assert.assertEquals(expected,med.getCompany());
    }

    @Test
    public void setPriceTest(){
        Integer expected = 100;

        MedicalDevices med = new MedicalDevices();
        med.setPrice(expected);

        Assert.assertEquals(expected,med.getPrice());
    }

}