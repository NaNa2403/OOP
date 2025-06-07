package lab13.decorator.ex1.shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
        shape.draw();
    }

    private void setRedBorder() {
        System.out.print("Red ");
    }
}