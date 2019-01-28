//package com.amadeus.birds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private Map<String, Object> storage = new HashMap<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addBird(String birdName, Double price, Integer quantity){
        if(storage.containsKey(birdName)){
            System.out.println("Такая птица уже есть");
        };
        Bird bird = new Bird(birdName, price, quantity);
        storage.put(birdName, bird);

    }

    public void addBirdStorage(String birdName, int quantity){

    }

    public void buyBirds(String customer, String nameBird, int quantuty){

    }

    public int getBirdsSale(String nameBird){
        return ;
    }
    public int getSoldBirdsMoney(String nameBird){
        return ;
    }
    public String getBirdsLessThanThree(){
        return ;
    }
    public int getTotalMoney(){
        return;
    }
    public String sortCumtomerByMoney(){

    }
    public String sortCustomerByQuantityBirds(){
        return;
    }
}
