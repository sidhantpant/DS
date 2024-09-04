package com.lld.polymorphism.def;

public class Guest extends Mentor{

    void doSomething(){
        Mentor m = new Mentor();
        m.sessions= 5;
    }
}
