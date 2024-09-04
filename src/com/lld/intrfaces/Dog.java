package com.lld.intrfaces;

public class Dog extends Animal implements Flying {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dogSpecific(){
        System.out.println("Dog specific method");
    }
    @Override
    public void fly() {
        System.out.println("Walk from Dog");

    }

    public Dog clone(){
        return  new Dog();
    }

    @Override
    public void talk() {
        System.out.println("Talk from Dog"+name);
    }
}
