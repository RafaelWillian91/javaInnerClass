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

    }
}
