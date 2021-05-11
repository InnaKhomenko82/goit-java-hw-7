public class Rectangle extends Shape {

    int x2, y2;

    public Rectangle(String name, int x1, int y1) {
        super(name, x1, y1);
    }

    public Rectangle(String name, String lineType, int x1, int y1) {
        super(name, lineType, x1, y1);
    }

    public Rectangle(String name, String lineType, int x1, int y1, int x2, int y2) {
        super(name, lineType, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", точка 2 (" + x2 +";" + y2 + ")";
    }
}
