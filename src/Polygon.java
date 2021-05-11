public class Polygon extends Shape {

    int r, n;

    public Polygon(String name, int x1, int y1, int n, int r) {
        super(name, x1, y1);
        this.n = n;
        this.r = r;
    }

    public Polygon(String name, String lineType, int x1, int y1, int n, int r) {
        super(name, lineType, x1, y1);
        this.n = n;
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", количество сторон " + n +
                ", радиус r = " + r;
    }
}
