package Basic;
public class datatype {
    byte A;
    short s;
    int j = 20;
    float f;
    double d;
    char c = 'A';
    boolean flag;
    String str = "abcd";
    public static void main(String[] args) {
        datatype obj = new datatype();
        System.out.println("byte: "+obj.A);
        System.out.println("short: "+obj.s);
        System.out.println("int: "+obj.j);
        System.out.println("float: "+obj.f);
        System.out.println("double: "+obj.d);
        System.out.println(obj.c);
        System.out.println(obj.flag);
        System.out.println(obj.str);

    }
    
}
