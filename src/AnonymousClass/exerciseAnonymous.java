package AnonymousClass;

import java.util.Random;

public class exerciseAnonymous {


    public static void main(String[] args) {

        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing anonymous..");
            }
        });

        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println(10 + 10);
            }
        });

        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Random ().nextInt(10));
            }
        });
    }

    //Classes anonymous são execultadas dentro da aplicacao
    private static void doIt(Runnable running){

        System.out.println("Running....");
        running.run();
    }



}
