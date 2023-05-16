package localInnerClass;

public class Application {

    //Local Inner Class são Classes criadas dentro de métodos
    //Pouco usado, devido ao escopo ser só visivel dentro do método. Geralmente, cenários onde voce tem uma super classe
    //ou a implementacao de uma interface dentro de um método com um comportamento específico.
    public void greet(){

        class Greet{

            public void sayHi(){
                System.out.println("Hii!!");
            }

        }

        Greet greet = new Greet();
        greet.sayHi();

    }

}
