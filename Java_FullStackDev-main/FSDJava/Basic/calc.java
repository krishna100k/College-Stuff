package Basic;
public class calc {

    int a= 10;
    int b =20;
    int c;

    public void add(){
        c = a+b;
        System.out.println("Addition is: "+c);
    }

    public void sub(){
        c = a-b;
        System.out.println("Subtraction is: "+c);
    }

    public void mult(){
        c = a*b;
        System.out.println("Multiplication is: "+c);
    }

    public void div(){
        c =a/b;
        System.out.println("Division is: "+c);
    }

    public static void main(String[] args) {
        calc c1 = new calc();
        c1.add();
        c1.sub();
        c1.mult();
        c1.div();
    }
    
}
