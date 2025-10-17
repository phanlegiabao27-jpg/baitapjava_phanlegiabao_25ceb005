public class Circle {
    private double radius =1.0;
    private String color ="red";
    Circle() {
        System.out.println("defaul constructor");
    }
    Circle(double radius) {
        this.radius = radius;
        System.out.println("defaul constructor");
    }
    public double getRadius() {
        return this.radius;
    }
 public    void setRadius(double radius) {
         this.radius = radius;
     }
        public double getArea(){
            return Math.PI*(Math.pow(this.radius,2));
        }
        public double getCircumference(){
            return 2*(Math.PI*radius);
        }
        public String toString(){
            return "hi";
        }
    }

