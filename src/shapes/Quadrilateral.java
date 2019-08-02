package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = len
    }

    public int getLength() {
        return this.length;
    }

    public abstract void setLength(int length);

    public int getWidth() {
        return this.width;
    }

    public abstract void setWidth(int width);
}
