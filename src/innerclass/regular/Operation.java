package innerclass.regular;

public class Operation {

    private final  int value1;

    private final int value2;

    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public int execute(){
        //É possível instanciar uma innerClass dentro da outerClass.
        Sum sum = new Sum();
        return sum.calculate();
    }

    //A classe Sum é muito atrelada a operation, ela não tem sentido sozinha. Entao, ela é uma candidata a ser uma innerClass.

    //**** Regular innerClass **** privada. A innerClass tem acesso aos atributos da sua outerCLass, ou seja, a classe externa a
    //innerClass
    private class Sum {

        public int calculate() {
            return value1 + value2;//Existe a visibilidade dos atributos da alterClass
        }
    }
}
