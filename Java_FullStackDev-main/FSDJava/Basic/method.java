package Basic;
public class method {
    public void m1(){
        System.out.println("m1 called");
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }

    public void m2(){
        System.out.println("m2 called");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        method obj = new method();
        obj.m1();
        obj.m2();
        System.out.println("Main end");

    }
}
