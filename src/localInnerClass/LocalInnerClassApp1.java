package localInnerClass;

public class LocalInnerClassApp1 {

    public static void main(String[] args) {

        Application aplication = new Application();
        aplication.greet();

        System.out.println("-------------------------------------");

        Application2 application2 = new Application2();
        application2.greet("Rafael");

    }




}
