package models;

import com.sun.javafx.image.IntPixelGetter;
import org.junit.Assert;
import org.junit.Test;

public class SneakersTest {
    @Test
    public void setNameTest(){
        String expected = "airjordans";

        Sneakers testSneaker = new Sneakers(1,null,null,1);
        testSneaker.setName(expected);

        Assert.assertEquals(expected,testSneaker.getName());
    }

    @Test
    public void setSportTest(){
        String expected = "basketball";

        Sneakers testSneaker = new Sneakers(1,null,null,1);
        testSneaker.setSport(expected);

        Assert.assertEquals(expected,testSneaker.getSport());
    }

    @Test
    public void setPriceTest(){
        int expected = 100;

        Sneakers testSneaker = new Sneakers(1,null,null,1);
        testSneaker.setPrice(expected);

        Assert.assertEquals(expected,testSneaker.getPrice());
    }

    @Test
    public void ConstructorTest(){
        int expectedPrice =100;
        String expectedName= "Dunk Lows";
        String expectedSport = "CasualWear";
        Integer expectedId = 1;

        Sneakers constructor = new Sneakers(expectedId,expectedName,expectedSport, expectedPrice);

        Assert.assertEquals(expectedPrice, constructor.getPrice());
        Assert.assertEquals(expectedName, constructor.getName());
        Assert.assertEquals(expectedSport, constructor.getSport());
        Assert.assertEquals(expectedId, constructor.getId());


    }






}
