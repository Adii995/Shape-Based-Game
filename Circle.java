package shapeBasedProject2;

public class Circle implements TwoDShape {
	double r;
 
    Circle(double r){
    	if(r>0)
    	this.r=r;
    	else
    		System.out.println("Invalid Radius Entered");
    }
   public String getDetails() {
	   return "Radius is:"+r+"unit";
  }
   public double getArea() {
	   return Math.PI*r*r;
   }
   public double getPerimeter() {
		return 2*Math.PI*r;
	}
   
   
}
