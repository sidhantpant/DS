package com.lld.intrfaces;

public class Cat extends Animal implements Flying {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Cat started flying");
    }

    public Cat clone(){
        return  new Cat();
    }

    @Override
    public void talk() {
        System.out.println("Talk from Cat"+name);
    }
}
