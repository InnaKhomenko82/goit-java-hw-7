public class Arc extends Shape {

    int x2, y2, x3, y3;

    public Arc(String name, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(name, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }

    public Arc(String name, String lineType, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(name, lineType, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", точка 2 (" + x2 +";" + y2 +
        ", точка 3 (" + x3 +";" + y3 + ")";
    }
}
