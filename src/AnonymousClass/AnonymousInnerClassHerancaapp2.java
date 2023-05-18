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

            public void teste(){
                System.out.println("sasa");
            }
        };

        f2.eat();
        //f2.teste(); // nao definido dentro da classe FoodHerancaapp2, portando não é possivel chamalo, devido ao polimorfismo.


    }
}
