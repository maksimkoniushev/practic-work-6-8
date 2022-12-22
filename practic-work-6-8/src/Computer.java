public class Computer {
    public final String vendor;
    public final String name;
    CPU cpu;
    RAM ram;
    Carrier carrier;
    Monitor monitor;
    Keyboard keyboard;
    double computerWeight;

    public Computer(String vendor,
                    String name,
                    CPU cpu,
                    RAM ram,
                    Carrier carrier,
                    Monitor monitor,
                    Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.carrier = carrier;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getComputerWeight() {
        return computerWeight;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setCpu(CPU cpu) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setRam(RAM ram) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setCarrier(Carrier carrier) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, carrier, monitor, keyboard);
    }

    public void setComputerWeight(double computerWeight) {
        this.computerWeight = computerWeight;
    }

    public String toString() {
        calcComputerWeight();
        return "Производитель: " + vendor + ";\n" +
                "Название: " + name + ";\n\n" +
                "Информация по комплектующим:\n" +
                cpu.toString() +
                ram.toString() +
                carrier.toString() +
                monitor.toString() +
                keyboard.toString() +
                "Информационно: вес компьютера в сборе - " +
                computerWeight + " кг.\n";
    }

    public void calcComputerWeight() {
        computerWeight =
                cpu.getCpuWeight() +
                ram.getRamWeight() +
                carrier.getCarrierWeight() +
                monitor.getMonitorWeight() +
                keyboard.getKeyboardWeight();
    }
}
