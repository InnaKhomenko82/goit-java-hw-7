public class Circle extends Shape {

    int r;

    public Circle(String name, int x1, int y1) {
        super(name, x1, y1);
    }

    public Circle(String name, String lineType, int x1, int y1) {
        super(name, lineType, x1, y1);
    }

    public Circle(String name, String lineType, int x1, int y1, int r) {
        super(name, lineType, x1, y1);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", радиус r = " + r;
    }

}
