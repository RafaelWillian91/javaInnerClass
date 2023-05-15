package staticNested;

public class Operation {

    private final int value1;
    private final int value2;

    private final Counter count1 = new Counter();
    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int sum(){
        count1.increment();
        return value1 + value2;
    }

    public Counter getCount1() {
        return count1;
    }

    //CLasse nao tem relacao com aos atributos da olterCLass. Inclusive ela funcionaria como uma classe aparte da innerClass
    //Eu posso separar a classe Counter em um arquivo .class próprio, que tudo continuaria funcionando.
    //Uma static nested class é uma classe que está ali por conviniencia e não pq precisaria estar ali.
    //Uma Regular Inner class teriamos que remover elea fazendo refactor nos atributos e parametros para funcionar.
    //Como Counter não tem relação ela é uma forte candidata a ser uma static class (static Nested class)
    public static class Counter{

                private int count;

                private void increment(){
                    count++;
                }

                public int getCount() {
                    return count;
                }
            }

}
