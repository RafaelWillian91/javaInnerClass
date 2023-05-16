package staticNested.exercise;

public class MainStatsJVM {

    public static void main(String[] args) {

        Memory memory = new Memory();
        Memory.Stats memoryStats = memory.stats();
        System.out.println(memoryStats);

    }
}
