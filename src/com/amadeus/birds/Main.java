//package com.amadeus.birds;

public class Main
{

    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.addBird("crow", 1);
        shop.addBird("eagle", 5);
        shop.addBird("duck",  0.5);

        shop.addBirdStorage("crow", 20);
        shop.addBirdStorage("eagle", 23);
        shop.addBirdStorage("duck", 4);

        shop.buyBirds("Customer1" , "crow");
        shop.buyBirds("Customer1" , "crow");
        shop.buyBirds("Customer1" , "eagle");
        shop.buyBirds("Customer1" , "duck");

        shop.buyBirds("Customer2" , "eagle");
        shop.buyBirds("Customer2" , "eagle");
        shop.buyBirds("Customer2" , "eagle");
        shop.buyBirds("Customer2" , "duck");

        shop.buyBirds("Customer2" , "duck");
        shop.buyBirds("Customer2" , "duck");
        shop.buyBirds("Customer2" , "duck");

        System.out.println("Demo asdasdasd!!!");

        System.out.println("Birds sale "+ shop.getBirdsSale("crow") + "ворон на сумму" + shop.getSoldBirdsMoney("crow"));
        System.out.println("Birds sale "+ shop.getBirdsSale("eagle") + "орлов на сумму" + shop.getSoldBirdsMoney("eagle"));
        System.out.println("Birds sale "+ shop.getBirdsSale("duck") + "уток на сумму" + shop.getSoldBirdsMoney("duck"));
        System.out.println("Нас кладе меньше 3-ёх птиц" + shop.getBirdsLessThanThree());
        System.out.println("Заработано денег" + shop.getTotalMoney());
        System.out.println("Список покупателей отсортирован по количеству потраченных денег" + shop.sortCumtomerByMoney());
        System.out.println("Cписок покупателей отсортирован по количеству совершённых покупок" + shop.sortCustomerByQuantityBirds());

    }
}