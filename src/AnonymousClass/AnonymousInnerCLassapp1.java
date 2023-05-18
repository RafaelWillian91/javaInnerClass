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
            public int num() {
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
            public int num() {
                return 10;
            }


            //Funciona comop uma classe normal, então esse método só é visto na anonymous class e portando nao pode ser
            //chamado com base na interface -> Message m = new Message(){}, pq não podemos fazer Message m = new AnonymousClass(){}. pq
            // essa anonymous inner class é gerada em tempo de compilação.
            public int test(){
                return 4;
            }


        };


        System.out.println(m.message());
        System.out.println(m2.message());
        System.out.println(m2.num());





    }


}
