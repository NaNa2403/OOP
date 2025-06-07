package lab13.builder.ex2;

public class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public ConcreteComputerBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setRam(String ram) {
        computer.setRam(ram);
    }

    @Override
    public void setStorage(String storage) {
        computer.setStorage(storage);
    }

    @Override
    public void setGpu(String gpu) {
        computer.setGpu(gpu);
    }

    @Override
    public void setWifi(boolean enabled) {
        computer.setWifi(enabled);
    }

    @Override
    public void setBluetooth(boolean enabled) {
        computer.setBluetooth(enabled);
    }

    public Computer getProduct() {
        Computer result = this.computer;
        this.reset();
        return result;
    }
}

