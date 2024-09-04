package com.lld.generics;

import com.lld.intrfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Box<Animal> box = new Box<Animal>();
        box.add(new Dog());
        box.add(new Cat());
        System.out.println(box.getList());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
//        CASE-1
//        Careful here we are passing specific type to List<Animal> so List<Dog> can be passed to List<Animal>,
//        Dog extends Animal but List<Dog> doesn't extend List<Animal> not logically correct
//        List<Dog> dogList1 = new ArrayList<>();
//        box.addList(dogList1,new Cat());
        box.addList(animalList,new Cat());//

//        CASE-2
//        Here we can pass any type of List<Dog> or List<Cat> since we are using wildcards inside the method
//        but we cannot add anything to that specific List ,it should be used as read only
        List<Dog> dogList = new ArrayList<>();
        box.addListGeneric(dogList);
        List<Cat> catList = new ArrayList<>();
        box.addListGeneric(catList);


        Integer[] arr = new Integer[4];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        int count = NatNum.countGreaterThan(arr,3);
        System.out.println(count);
        Pair<Dog,Integer> pair = new Pair<>();

        Animal dog = new Dog();
        Cat cat = new Cat();
//        Duck duck = new Duck();
        cat.setName("Pussy");
        NaturalAnimal<Cat> catNaturalAnimal = new NaturalAnimal<>(cat);
        catNaturalAnimal.getValue(cat);
    }
}