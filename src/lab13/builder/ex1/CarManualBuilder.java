package lab13.builder.ex1;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.addContent("Seats: " + number);
    }

    @Override
    public void setEngine(String type) {
        manual.addContent("Engine: " + type);
    }

    @Override
    public void setTripComputer(boolean enabled) {
        manual.addContent("Trip Computer: " + (enabled ? "Yes" : "No"));
    }

    @Override
    public void setGPS(boolean enabled) {
        manual.addContent("GPS: " + (enabled ? "Yes" : "No"));
    }

    public Manual getProduct() {
        Manual result = this.manual;
        this.reset();
        return result;
    }
}

