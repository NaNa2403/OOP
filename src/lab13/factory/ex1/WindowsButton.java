package lab13.factory.ex1;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows-style button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked!");
    }
}
