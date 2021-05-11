public abstract class Shape implements IShape {
    private static final String LINE_TYPE = "основная";
    private static int numb;
    private String name;
    private String lineType;
    private int x1, y1;

    public Shape(String name, int x1, int y1) {
        this.name = name;
        lineType = LINE_TYPE;
        this.x1 = x1;
        this.y1 = y1;
        numb++;
    }

    public Shape(String name, String lineType, int x1, int y1) {
        this.name = name;
        this.lineType = lineType;
        this.x1  = x1;
        this.y1 = y1;
        numb++;
    }

    @Override
    public String toString() {
        return numb + "-й примитив " + name + ", cтиль линии " + lineType +
                ", \n точка 1 (" + x1 +";" + y1 + ")";
    }


    public String getName() {
        return numb + "-й примитив " + name;
    }
}
