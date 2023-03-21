package Abstraction;

class hdfc implements rbi{
public void createAcc(){
    System.out.println("Account Created");
}
}


interface rbi{
    public void createAcc();
}


public class bank {
    public static void main(String[] args) {
        rbi b = new hdfc();
        b.createAcc();
    }
}
