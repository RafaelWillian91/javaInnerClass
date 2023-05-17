package AnonymousClass;

public class AnonymousInnerCLassapp1 {

    public static void main(String[] args) {

        //O compilador criou um classe e implementou ela com os parâmetros informados dentro de {}.
        Message m = new Message() {
            @Override
            public String message() {
                return "Hi anonymou Class!!";
            }

            @Override
            public int teste() {
                return 0;
            }
        };

        //Posso ter mais de uma classe anonima implementando a mesma interface.
        Message m2 = new Message() {
            @Override
            public String message() {
                return "Hi anonymou Class 02!!";
            }

            @Override
            public int teste() {
                return 0;
            }
        };


        System.out.println(m.message());
        System.out.println(m2.message());

    }


}
