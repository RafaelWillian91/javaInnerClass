package AnonymousClass;

public class AnonymousInnerClassHerancaapp2 {

    public static void main(String[] args) {

        //Sem classe anonima
        FoodHerancaapp2 f1 = new FoodHerancaapp2();
        f1.eat();

        //Usando classe anonima para sobrescrever o método eat
        FoodHerancaapp2 f2 = new FoodHerancaapp2(){
            @Override
            public void eat() {
                System.out.println("lunch Time com Anonymous!!!");
            }
        };

        f2.eat();


    }
}
