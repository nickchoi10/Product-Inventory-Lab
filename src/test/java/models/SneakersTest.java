package models;

import org.junit.Assert;
import org.junit.Test;

public class SneakersTest {
    @Test
    public void setNameTest(){
        String expected = "airjordans";

        Sneakers testSneaker = new Sneakers();
        testSneaker.setName(expected);

        Assert.assertEquals(expected,testSneaker.getName());
    }

    @Test
    public void setSportTest(){
        String expected = "basketball";

        Sneakers testSneaker = new Sneakers();
        testSneaker.setSport(expected);

        Assert.assertEquals(expected,testSneaker.getSport());
    }

    @Test
    public void setPriceTest(){
        Integer expected = 100;

        Sneakers testSneaker = new Sneakers();
        testSneaker.setPrice(expected);

        Assert.assertEquals(expected,testSneaker.getPrice());
    }








}
