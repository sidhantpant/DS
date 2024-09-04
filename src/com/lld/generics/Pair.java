package com.lld.generics;

import com.lld.intrfaces.Animal;
import com.lld.intrfaces.Dog;
import com.lld.intrfaces.Flying;

import java.util.List;

public class Pair<V, S> {

    V first;
    S second;

    public static <X, M> M doSomething(X k) {
        //   String t = k+"jhj";
        return (M) String.valueOf(k);

    }

    public V getFirst() {
        return first;
    }

    void setFirst(V first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public <T> Animal add(T t) {
        return new Dog();
    }

    public <T extends Animal, M extends Flying> M addAnimal(List<T> animals, M obj) {
        for (T t : animals) {
            obj.fly();
            t.walk();
        }
        return obj;
    }
}
