package com.lld.concurrency;

import com.sun.org.apache.xml.internal.resolver.helpers.FileURL;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Lock lock = new ReentrantLock();
        Value val = new Value();
        Adder adder = new Adder(val,lock);
        Subtractor sub = new Subtractor(val,lock);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subFuture = executorService.submit(sub);

        adderFuture.get();
        subFuture.get();
        System.out.println(val.getValue());

    }
}
