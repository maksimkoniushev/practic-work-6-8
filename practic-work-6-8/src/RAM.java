public class RAM {
    private final String ramType;
    private final int memoryVolume;
    private final double ramWeight;

    public RAM(String ramType, int memoryVolume, double ramWeight) {
        this.ramType = ramType;
        this.memoryVolume = memoryVolume;
        this.ramWeight = ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public RAM setRamType(String ramType) {
        return new RAM(ramType, memoryVolume, ramWeight);
    }

    public RAM setMemoryVolume(int memoryVolume) {
        return new RAM(ramType, memoryVolume, ramWeight);
    }

    public RAM setRamWeight(double ramWeight) {
        return new RAM(ramType, memoryVolume, ramWeight);
    }

    public String toString() {
        return "2. Оперативная память:\n" +
                "  - тип: " + ramType + ";\n" +
                "  - объем: " + memoryVolume + " Гb;\n" +
                "  - вес: " + ramWeight + " кг.\n";
    }
}