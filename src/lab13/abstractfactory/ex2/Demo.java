public class Demo {
    public static void main(String[] args) {
        System.out.println("[Client] Creating UI for Windows:");
        GUIFactory winFactory = new WindowsFactory();
        Application app1 = new Application(winFactory);
        app1.renderUI();

        System.out.println("\n[Client] Creating UI for Mac:");
        GUIFactory macFactory = new MacFactory();
        Application app2 = new Application(macFactory);
        app2.renderUI();
    }
}