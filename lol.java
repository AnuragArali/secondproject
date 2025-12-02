public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);

        printArea(circle);
        printArea(rect);
    }

    static void printArea(Shape shape) {
        double area = switch (shape) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
        };

        System.out.println("Area: " + area);
    }
}
