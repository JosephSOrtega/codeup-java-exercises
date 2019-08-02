package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    //    public abstract void Quadrilateral(int num);
    public Quadrilateral(int num, int nums) {
        this.length = num;
        this.width = nums;
    }


    public int getLength() {
        return this.length;
    }

    public abstract void setLength(int num);

    public int getWidth() {
        return this.width;
    }

    public abstract void setWidth(int nums);
}
