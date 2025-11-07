public class ShapeFactory {
    public Shape getShape(SHAPE_TYPE type){
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }

    public enum SHAPE_TYPE{
        RECTANGLE,
        SQUARE,
        CIRCLE
    }
}
