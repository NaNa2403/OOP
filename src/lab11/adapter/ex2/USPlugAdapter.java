package lab11.adapter.ex2;

public class USPlugAdapter implements EuroSocket {
    private USPlug usPlug;

    public USPlugAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void plugInEuro() {
        System.out.println("Adapter converting Euro socket to US plug...");
        usPlug.plugInUS();
    }
}
