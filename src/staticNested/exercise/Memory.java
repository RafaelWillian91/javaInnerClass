package staticNested.exercise;

public class Memory {

    private final Runtime runtime = Runtime.getRuntime();

    public Stats stats(){
        return new Stats(
                runtime.freeMemory(), runtime.totalMemory() - runtime.maxMemory(), runtime.totalMemory()
        );
    }



    public static class Stats{

        public final long memoryFree;
        public final long memoryOcupated;
        public final long memoryTotal;

        public Stats(long memoryFree, long memoryOcupated, long memoryTotal) {
            this.memoryFree = memoryFree;
            this.memoryOcupated = memoryOcupated;
            this.memoryTotal = memoryTotal;
        }

        public long getMemoryFree() {
            return memoryFree;
        }

        public long getMemoryOcupated() {
            return memoryOcupated;
        }

        public long getMemoryTotal() {
            return memoryTotal;
        }


        @Override
        public String toString() {
            return "Stats{" +
                    "memoryFree=" + memoryFree +
                    ", memoryOcupated=" + memoryOcupated +
                    ", memoryTotal=" + memoryTotal +
                    '}';
        }
    }

}
