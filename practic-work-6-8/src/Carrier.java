public class Carrier {
    private final CarrierType carrierType;
    private final double memoryVolume;
    private final double carrierWeight;

    public Carrier(CarrierType carrierType, double memoryVolume, double carrierWeight) {
        this.carrierType = carrierType;
        this.memoryVolume = memoryVolume;
        this.carrierWeight = carrierWeight;
    }

    public CarrierType getCarrierType() {
        return carrierType;
    }

    public double getMemoryVolume() {
        return memoryVolume;
    }

    public double getCarrierWeight() {
        return carrierWeight;
    }

    public Carrier setCarrierType(CarrierType carrierType) {
        return new Carrier(carrierType, memoryVolume, carrierWeight);
    }

    public Carrier setMemoryVolume(double memoryVolume) {
        return new Carrier(carrierType, memoryVolume, carrierWeight);
    }

    public Carrier setCarrierWeight(double carrierWeight) {
        return new Carrier(carrierType, memoryVolume, carrierWeight);
    }

    public String toString() {
        return "3. Носитель информации:\n" +
                "  - тип: " + carrierType + ";\n" +
                "  - объем памяти: " + memoryVolume + " Tb;\n" +
                "  - вес: " + carrierWeight + " кг.\n";
    }
}
