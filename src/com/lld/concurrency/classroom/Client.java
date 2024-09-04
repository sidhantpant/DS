package com.lld.concurrency.classroom;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        Adderr adderr = new Adderr(value);
        Subtractorr subtractorr = new Subtractorr(value);

        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Void> future1 = ex.submit(adderr);
        Future<Void> future2 = ex.submit(subtractorr);

        future1.get();
        future2.get();

        System.out.println(value.x);
    }
}
