package localInnerClass;

public class Application2 {

    //Local Inner Class são Classes criadas dentro de métodos
    //Pouco usado, devido ao escopo ser só visivel dentro do método. Geralmente, cenários onde voce tem uma super classe
    //ou a implementacao de uma interface dentro de um método com um comportamento específico.

    private final String message = "Hi";
    public void greet( String name){
 // public void greet( final String name){

        int x = 10;
        //final int x = 10;

        class Greet{

            //Primeira Lição: LocalInnerClass conseguem acessar olterCLass como as Regular Inner Class
            //Segunda Lição: As LocalInnerClass tem a capacidade de acessar as variáveis locais dos métodos
            //Terceira Lição: As variáveis que LocalInnerClass vai usar, que são variáveis locais do método, tem que ser final, se não tiver
            //o final o compilador assume final.
            public void sayHi(){

                System.out.format("%s, %s, %d", message, name, x);
            }

        }

        Greet greet = new Greet();
        greet.sayHi();

    }

}
