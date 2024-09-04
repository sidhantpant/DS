package com.lld.concurrency.classroom;

import java.util.concurrent.Callable;

public class Adderr implements Callable<Void> {

    Value value;
    Adderr(Value value){
        this.value = value;
    }
    public Void call(){
        for (int i = 0; i <= 5000; i++) {
            this.value.x = this.value.x+i;
        }
        return null;
    }
}
