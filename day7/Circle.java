public class Circle {
   private double radius;
   
   public Circle(double radius){
        this.radius=radius;
   }

   public void area(){
    double a=Math.PI*radius*radius;
    display("Area",a);
   }

   public void circumfrance(){
    double cir=2*Math.PI*radius;
    display("Circumfrance",cir);
   }

   public void display(String s,double v ){
    System.out.println("Circle "+s +v);
   }

   public static void main(String[] args) {
    Circle c1=new Circle(4.5);
    Circle c2=new Circle(3);

    c1.area();
    c1.circumfrance();

    c2.area();
    c2.circumfrance();
   }
}
