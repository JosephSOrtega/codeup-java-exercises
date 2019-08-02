package shapes;

class Square extends Quadrilateral {
        @Override
        public void Quadrilateral(int num, int nums) {
            this.length = num;
            this.width = nums;
        }
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
