package Constructors;
public class constructor {
    int i; //i is instance or class variable 
    // to store value in i we use constructor.

    public constructor(){
        System.out.println("Constructor called");
    }

    //cons name and class name should be same
    //same class name and cons name

    //types of const

    //parameterized const
    public constructor(int j){
        System.out.println("Para constructor(integer)");
    }

    public constructor(String s){
        System.out.println("Para constructor(string)");
    }

    

    public static void main(String[] args) {
        System.out.println("Main Start");
        constructor b = new constructor();
        //constructor b1 = new constructor();//cons is called whenever new obj is called
        constructor c1 = new constructor(11);
        constructor s1 = new constructor("New");
        System.out.println("Main end");  
    }
}
