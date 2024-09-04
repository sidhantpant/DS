package com.lld.generics;

import com.lld.intrfaces.Animal;
import com.lld.intrfaces.Cat;
import com.lld.intrfaces.Dog;

import java.util.ArrayList;
import java.util.List;

public class Box<T>{

    T t;

    List<T> list = new ArrayList<>();
    public void add(T t){
        list.add(t);
    }

    public List<T> getList() {
        return list;
    }

    public <X extends Animal, U extends Animal> void addList(List<Animal> animalList,U t){
        animalList.add(t);//Addition is allowed if specific type of List is passed we can do it outside as well to add dog in List<Animal>
       // animalList.add(new Cat());
        for(Animal a : animalList){
            System.out.println(a);
        }
    }

    public <U extends Animal> void addListGeneric(List<? extends Animal> animalList){
       // animalList.add(t);//With the wildcard you are not allowed to add bcz it can be of any type cat or dog ,so addition not allowed
        // animalList.add(new Cat());
        for(Animal a : animalList){
            System.out.println(a);
        }
    }
}
