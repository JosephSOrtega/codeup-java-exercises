package shapes;

abstract class Rectangle extends Quadrilateral implements Measurable{

        Measurable rectangle = new Quadrilateral(int num, int nums) {
            @Override
            public void setLength(num) {
                length = num;
            }

            @Override
            public void setWidth(nums) {

            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

//    int length;
//    int width;
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
