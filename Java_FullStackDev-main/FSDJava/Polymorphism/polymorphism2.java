package Polymorphism;
public class polymorphism2 extends polymorphism {
    public void m1(){
        super.m1();
        System.out.println("M1 of P2");
    }

    public void m2(int i){
        System.out.println("M2 of P2");
    }


    public static void main(String[] args) {
        polymorphism2 b = new polymorphism2();
        b.m1();
        b.m2(10);
    }
    
}

class polymorphism{
    public void m1(){
        System.out.println("M1 of P1");
    }

    public void m2(){
        System.out.println("M2 of P1");
    }

}


//     //overloading
//     // public void m1(){
//     //     System.out.println("Hello");
//     // }
//     // public void m1(int i){
//     //     System.out.println("New");
//     // }

//     // public static void main(String[] args) {
//     //     polymorphism a = new polymorphism();
//     //     a.m1();
//     //     a.m1(11);
//     // }
