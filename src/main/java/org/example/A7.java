@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}

public class A7 {
    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;
        System.out.println("Addition of "+add.calculate(3,4));
    }

}
