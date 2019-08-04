public class Triangle extends Shape {
    private double side1=1;
    private double side2=1;
    private double side3=1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public  double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        double result=0;
        return result= Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    @Override
    public String toString(){
        return "Triangle with side1 = " + getSide1() + ", side2 = "+getSide2()+ " side3 = " + getSide3()+ " Area = " + getArea() + " Perimeter = " + getPerimeter()+ " Which is a subclass of " +super.toString();

    }

}
