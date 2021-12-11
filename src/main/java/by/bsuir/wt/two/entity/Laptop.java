package by.bsuir.wt.two.entity;


import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {
    private static final long serialVersionUID = 6964455301541586483L;
    private double batteryCapacity;
    private String operatingSystem;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop() {

    }

    public Laptop(double price, double batteryCapacity, String operatingSystem, double memoryROM, double systemMemory,
                  double cpu, double displayInches) {
        super.price = price;
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void getOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && Double.compare(laptop.memoryROM, memoryROM) == 0
                && Double.compare(laptop.systemMemory, systemMemory) == 0 && Double.compare(laptop.cpu, cpu) == 0
                && Double.compare(laptop.displayInches, displayInches) == 0
                && operatingSystem.equals(laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return (int) (11 * price + 23 * batteryCapacity - Objects.hashCode(operatingSystem) + 7 * memoryROM
                + 13 * systemMemory + 29 * cpu - 5 * displayInches) ^ 0b110100011100100011010110001;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "price=" + price + ", batteryCapacity=" + batteryCapacity
                + ", operatingSystem='" + operatingSystem + ", memoryROM=" + memoryROM + ", systemMemory="
                + systemMemory + ", cpu=" + cpu + ", displayInches=" + displayInches + '}';
    }
}