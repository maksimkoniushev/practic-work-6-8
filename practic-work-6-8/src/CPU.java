public class CPU {
    private final double frequency;
    private final int core;
    private final String produce;
    private final double cpuWeight;

    public CPU(double frequency, int core, String produce, double cpuWeight) {
        this.frequency = frequency;
        this.core = core;
        this.produce = produce;
        this.cpuWeight = cpuWeight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCore() {
        return core;
    }

    public String getProduce() {
        return produce;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    public CPU setFrequency(double frequency) {
        return new CPU(frequency, core, produce, cpuWeight);
    }

    public CPU setCore(int core) {
        return new CPU(frequency, core, produce, cpuWeight);
    }

    public CPU setProduce(String produce) {
        return new CPU(frequency, core, produce, cpuWeight);
    }

    public CPU setCpuWeight(double cpuWeight) {
        return new CPU(frequency, core, produce, cpuWeight);
    }

    public String toString() {
        return "1. Процессор:\n" +
                "  - тактовая частота: " + frequency + " Ггц;\n" +
                "  - количество ядер: " + core + ";\n" +
                "  - производитель: " + produce + ";\n" +
                "  - вес: " + cpuWeight + " кг.\n";
    }
}


