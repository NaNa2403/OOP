package lab11.adapter.ex2;

public class EuroSocketDevice {
    private EuroSocket socket;

    public EuroSocketDevice(EuroSocket socket) {
        this.socket = socket;
    }

    public void powerOn() {
        System.out.println("Powering device with Euro socket:");
        socket.plugInEuro();
    }
}
