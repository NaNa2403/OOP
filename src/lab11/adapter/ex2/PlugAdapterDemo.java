package lab11.adapter.ex2;

public class PlugAdapterDemo {
    public static void main(String[] args) {
        // Thiết bị cần ổ cắm châu Âu
        EuroSocketDevice device;

        // Cắm đúng kiểu
        System.out.println("Cắm đúng kiểu Euro:");
        device = new EuroSocketDevice(() -> System.out.println("Plugged in using Euro plug."));
        device.powerOn();

        System.out.println("\nCắm sai kiểu – cần dùng Adapter:");
        USPlug usPlug = new USPlug();
        EuroSocket usAdapter = new USPlugAdapter(usPlug);
        device = new EuroSocketDevice(usAdapter);
        device.powerOn();
    }
}
