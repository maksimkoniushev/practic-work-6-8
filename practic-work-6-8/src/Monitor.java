public class Monitor {
    private final int diagonal;
    private final MonitorType monitorType;
    private final double monitorWeight;

    public Monitor(MonitorType monitorType, int diagonal, double monitorWeight) {
        this.monitorType = monitorType;
        this.diagonal = diagonal;
        this.monitorWeight = monitorWeight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public double getMonitorWeight() {
        return monitorWeight;
    }

    public Monitor setMonitorType(MonitorType monitorType) {
        return new Monitor(monitorType, diagonal, monitorWeight);
    }

    public Monitor setDiagonal(int diagonal) {
        return new Monitor(monitorType, diagonal, monitorWeight);
    }

    public Monitor setMonitorWeight(double monitorWeight) {
        return new Monitor(monitorType, diagonal, monitorWeight);
    }

    public String toString() {
        return "4. Монитор:\n" +
                "  - тип: " + monitorType + ";\n" +
                "  - диагональ: " + diagonal + "'';\n" +
                "  - вес: " + monitorWeight + " кг.\n";
    }
}

