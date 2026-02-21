package shapeBasedProject2;

public class cube implements ThreeDShape {
	double s;
	   cube(double s){
		   if(s>0) {
			   this.s=s;
		   }
		   else {
			   System.out.println("side must be positive");
		   }
	   }
	  @Override
	  public double getVolume() {
		  return s*s*s;
	  }
	  @Override
	  public double getLateralSurfaceArea() {
		 return 4*s*s; 
	  }
	  @Override
	  public double getTotalSurfaceArea() {
		  return 6*s*s;
	  }
	}


