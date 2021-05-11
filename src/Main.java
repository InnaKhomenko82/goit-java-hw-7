public class Main {
    public static void main(String[] args) {

        ServiceShape shape = new ServiceShape();
        System.out.println("\nВывод списка примитивов с параметрами для отрисовки:");
        System.out.println(shape.toString(new Line("Линия", 5, 7, 13, 16)));
        System.out.println(shape.toString(new Circle("Окружность", "осевая", 12, 56, 25)));
        System.out.println(shape.toString(new Arc("Дуга", 74, 32, 46, 54, 25, 96)));
        System.out.println(shape.toString(new Rectangle("Прямоугольник", "тонкая", 25, 48, 56, 125)));
        System.out.println(shape.toString(new Polygon("Многоугольник", 74, 23, 3, 123)));

        System.out.println("\nВывод только названий примитивов:");
        System.out.println(shape.getShapeName(new Line("Линия", 5, 7, 65, 48)));
        System.out.println(shape.getShapeName(new Circle("Окружность", "осевая", 12, 56)));
        System.out.println(shape.getShapeName(new Arc("Дуга", 74, 32, 46, 54, 25, 96)));
        System.out.println(shape.getShapeName(new Rectangle("Прямоугольник", "тонкая", 25, 48)));
        System.out.println(shape.getShapeName(new Polygon("Многоугольник", 74, 23, 3, 123)));



    }
}
