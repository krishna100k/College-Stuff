package Abstraction;

abstract class A {
    public abstract void m1();
}
//we cannot create object of abstract class

class B extends A{
    public void m1(){
        System.out.println("Hello");
    }
}

public class Test{
    public static void main(String[] args) {
        A obj = new B();
        obj.m1();
    }
}
