package shapeBasedProject2;

public class Square implements TwoDShape {
	double s;
	
	 Square(double s){
	    	if(s>0)
	    	this.s=s;
	    	else
	    		System.out.println("Invalid side Entered");
	} 
	 @Override
	  public String getDetails(){
              return "side is: "+ s +" Unit";
 }
	 @Override
       public double getArea(){
          double area = s*s;
        return area;
 }
	  @Override
       public double getPerimeter(){
          double perimeter = 4*s;
        return perimeter;
  }
}