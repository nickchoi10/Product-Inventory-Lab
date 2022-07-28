package service;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import models.Sneakers;
import sun.text.resources.BreakIteratorInfo;

import java.text.BreakIterator;
import java.util.ArrayList;

public class SneakersService {

 private int nextId = 1;




 private ArrayList<Sneakers> inventory = new ArrayList<>();

 public SneakersService(){}

 public Sneakers create(String name, String sport, int price) {
  Sneakers createdSneaker = new Sneakers(nextId++, name, sport, price);

  inventory.add(createdSneaker);

  return createdSneaker;
 }


 public String findSneaker(int id) {

  for (Sneakers s : inventory) {
   if(s.getId() == id)
    return s.getName();
  }
  return null;
 }

 public ArrayList<Sneakers> findAll(){
  return inventory;

 }

public boolean delete(int id){
  for(Sneakers s: inventory){
   if(s.getId()==id){
    inventory.remove(s);
    return true;
   }
  }
  return false;
}



}
