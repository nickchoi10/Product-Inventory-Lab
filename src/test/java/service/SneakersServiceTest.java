package service;

import models.Sneakers;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class SneakersServiceTest {
//        List<Sneakers> inventory = new ArrayList<>();
//        SneakersService sneakerService = new SneakersService();
//        Sneakers sneaker1 = sneakerService.create("Air Jordans","basketball", 200);
//        Sneakers sneaker2 = sneakerService.create("DunkLows","basketball", 100);
//        Sneakers sneaker3 = sneakerService.create("AirForce1","basketball", 100);
//        Sneakers sneaker4 = sneakerService.create("curry2lows","basketball", 180);

    @Test
    public void createTest(){
        String expectedName = "drunkLows";
        String expectedSport = "casual";
        int expectedPrice = 100;

        SneakersService sneakersService= new SneakersService();
        Sneakers instance = sneakersService.create(expectedName,expectedSport,expectedPrice);

        int actualId = instance.getId();
        String actualName = instance.getName();
        String actualSport = instance.getSport();
        int actualPrice = instance.getPrice();

        Assert.assertEquals(Integer.class.getName(),new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPrice,actualPrice);
        Assert.assertEquals(expectedSport,actualSport);

    }

@Test
       public void findSneaker() {
            SneakersService sneakerService = new SneakersService();
            Sneakers sneaker1 = sneakerService.create("Air Jordans","basketball", 200);
            Sneakers sneaker2 = sneakerService.create("DunkLows","basketball", 100);


        String expectedName2 = sneakerService.findSneaker(2);
        String expectedName1 = sneakerService.findSneaker(1);

//    String expectedName1 = sneaker1.getName();
//        String expectedName2 = sneaker2.getName();


        Assert.assertEquals(expectedName1, "Air Jordans");
        Assert.assertEquals(expectedName2, "DunkLows");
        }

        @Test
        public void findAll() {
            SneakersService sneakerService = new SneakersService();
            Sneakers sneaker1 = sneakerService.create("Air Jordans","basketball", 200);
            Sneakers sneaker2 = sneakerService.create("DunkLows","basketball", 100);
            Sneakers sneaker3 = sneakerService.create("AirForce1","basketball", 100);
            Sneakers sneaker4 = sneakerService.create("curry2lows","basketball", 180);



            ArrayList<Sneakers> actual = sneakerService.findAll();
            Assert.assertEquals( 4, actual.size());


        }

        @Test
        public void delete() {
        SneakersService sneakerService = new SneakersService();
        Sneakers sneaker1 = sneakerService.create("Air Jordans","basketball", 200);
        Sneakers sneaker2 = sneakerService.create("DunkLows","basketball", 100);
        Sneakers sneaker3 = sneakerService.create("AirForce1","basketball", 100);
        Sneakers sneaker4 = sneakerService.create("curry2lows","basketball", 180);


        sneakerService.delete(1);
        sneakerService.delete(2);
        sneakerService.delete(3);



        ArrayList<Sneakers> actual = sneakerService.findAll();
        Assert.assertEquals( 1, actual.size());

        }
    }