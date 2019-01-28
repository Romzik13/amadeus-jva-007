//package com.amadeus.birds;

public class Main
{

    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.addBird("crow", 1.0, 20);
        shop.addBird("eagle", 5.0, 23);
        shop.addBird("duck",  0.5, 4);

        shop.buyBirds("Customer1" , "crow", 3);
        shop.buyBirds("Customer1" , "eagle", 2);
        shop.buyBirds("Customer1" , "duck", 1);

        shop.buyBirds("Customer2" , "eagle", 3);
        shop.buyBirds("Customer2" , "duck", 1);

        shop.buyBirds("Customer2" , "duck", 3);

        System.out.println("Birds sale "+ shop.getBirdsSale("crow") + "ворон на сумму" + shop.getSoldBirdsMoney("crow"));
        System.out.println("Birds sale "+ shop.getBirdsSale("eagle") + "орлов на сумму" + shop.getSoldBirdsMoney("eagle"));
        System.out.println("Birds sale "+ shop.getBirdsSale("duck") + "уток на сумму" + shop.getSoldBirdsMoney("duck"));
        System.out.println("Нас кладе меньше 3-ёх птиц" + shop.getBirdsLessThanThree());
        System.out.println("Заработано денег" + shop.getTotalMoney());
        System.out.println("Список покупателей отсортирован по количеству потраченных денег" + shop.sortCumtomerByMoney());
        System.out.println("Cписок покупателей отсортирован по количеству совершённых покупок" + shop.sortCustomerByQuantityBirds());

    }
}