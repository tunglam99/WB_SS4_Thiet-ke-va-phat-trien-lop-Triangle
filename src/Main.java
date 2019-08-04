public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Triangle triangle = new Triangle(4,5,7);
        triangle.setColor("Yellow");
        System.out.println(triangle);
    }
}
