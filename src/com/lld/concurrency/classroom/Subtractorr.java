package com.lld.concurrency.classroom;

import com.lld.concurrency.classroom.Value;

import java.util.concurrent.Callable;

public class Subtractorr implements Callable<Void> {

    Value value;
    Subtractorr(Value value){
        this.value = value;
    }
    @Override
    public Void call(){

        for (int i = 0; i <= 5000; i++) {
            this.value.x = this.value.x-i;
        }
        return null;
    }
}
