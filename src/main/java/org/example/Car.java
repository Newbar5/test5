package org.example;

public class Car extends Vehicle{
    public Car(int a) {
        this(1,2,3);
    }
    public Car(int a, int b){
        super(2,4,7,8);

    }
    public Car(int a,int b, int c){
        this(1,3);
    }
}
