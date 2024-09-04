package com.lld.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Value value;
    Lock lock;

    public Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i <= 500000; i++) {
            lock.lock();
            int val = this.value.getValue();
            val = val -i;
            value.setValue(val);
            lock.unlock();
        }
        return null;
    }
}
