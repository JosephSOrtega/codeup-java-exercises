package shapes;

class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int num, int nums) {
        super(num, nums);
    }
//    @Override
//    public void Quadrilateral(int num) {
//        this.length = num;
//        this.width = num;
//    }


    @Override
    public void setLength(int num) {
        this.length = num;

    }

    @Override
    public void setWidth(int nums) {
        this.width = nums;

    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    public void Quadrilateral(int num, int nums) {
//        this.length = num;
//        this.width = nums;
//    }
//    @Override
//    public void setLength(int leng) {
//        this.length = leng;
//    }
//    @Override
//    public void setWidth(int wid) {
//        this.width = wid;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    @Override
//    public double getArea() {
//        return length * width;
//    }


//
//    Rectangle(int len, int wid) {
//        this.length = len;
//        this.width = wid;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }

}
