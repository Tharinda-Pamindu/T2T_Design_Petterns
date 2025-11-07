public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape(ShapeFactory.SHAPE_TYPE.SQUARE);
        System.out.println(square.draw());

        Shape circle = shapeFactory.getShape(ShapeFactory.SHAPE_TYPE.CIRCLE);
        System.out.println(circle.draw());

        Shape rectangle = shapeFactory.getShape(ShapeFactory.SHAPE_TYPE.RECTANGLE);
        System.out.println(rectangle.draw());
    }
}
