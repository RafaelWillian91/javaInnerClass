package staticNested;

public class StaticnestedApp1 {

    public static void main(String[] args) {

        Operation op1 = new Operation(10, 30);
        System.out.println(op1.sum());
        System.out.println(op1.sum());

        System.out.println(op1.getCount1().getCount());

        //Para referenciar uma classe static como innerClass
        Operation.Counter counter = op1.getCount1();
        System.out.println(counter.getCount());

        System.out.println("----------------------------------------------------------");

        Operation1 op2 = new Operation1(79, 20);
        System.out.println(op2.sum());
        System.out.println(op2.sum());

        System.out.println(op2.getCount1().getCount());

        //Para referenciar uma classe static como innerClass
        Operation1.Counter counter2 = op2.getCount1();
        System.out.println(counter2.getCount());


    }
}
