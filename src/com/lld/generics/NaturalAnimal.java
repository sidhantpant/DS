package com.lld.generics;

import com.lld.intrfaces.Animal;
import com.lld.intrfaces.Dog;
import com.lld.intrfaces.Flying;

public class NaturalAnimal<T extends Flying>{

    private T t;

    public NaturalAnimal(T t){
        this.t = t;
    }
    public <U extends Animal> void getValue(U u){
        t.fly();
        System.out.println("Any business logic for this");
        u.walk();
        u.talk();
    }


}
