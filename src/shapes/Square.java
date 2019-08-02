package shapes;

abstract class Square extends Quadrilateral {


    Measurable square = new Quadrilateral() {
        @Override
        public void Quadrilateral(int length, int width) {

        }

        @Override
        public void setLength(int length) {

        }

        @Override
        public void setWidth(int width) {

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

//    private int side;
//
//    Square(int sid){
//        super(sid,sid);
//        this.side = sid;
//    }
//    public int getArea(){
//        return side * side;
//    }
//    public int getPerimeter(){
//        return side * 4;
//    }

}
