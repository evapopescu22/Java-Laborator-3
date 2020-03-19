package org.laboratoare.laborator3;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
	Item book1=new Book("Dragon Rising",300,5);
	Item book2=new Book("A Blade in the Dark",300,5);
	Food food1=new Food();
	food1.setName("Cabbage");
	food1.setWeight(2);
	Food food2=new Food();
	food2.setName("Rabbit");
	food2.setWeight(2);
	Item weapon=new Weapon(5,10, Weapon.WeaponType.Sword);
	Knapsack knapsack1=new Knapsack();
        knapsack1.setCapacity(10);
        List<Item> items1=new ArrayList<>();
        items1.add(book1);
        items1.add(book2);
        items1.add(food1);
        items1.add(food2);
        items1.add(weapon);
        knapsack1.setItems(items1);
        System.out.println(knapsack1);
    }
}