package shapeBasedProject2;

public class Rectangle implements TwoDShape {
double l,w;

	Rectangle(double l, double w){
		if(l>0 && w>0) {
			this.l=l;
			this.w=w;
		}else if(l<0 && w<0) {
			System.out.println("Length and width must not be negative");
		}else if(l<0) {
			this.w=w;
			System.out.println("Length must not be negative");
		}
		else if(w<0) {
			System.out.println("Length must not be negative");
			this.l=l;
		}
	}
	@Override
	public String getDetails() {
		return "Length is: "+l+" Unit and Width is: "+w+" Unit";
	}
	@Override
	public double getArea() {
		return l*w;
	}
	@Override
	public double getPerimeter() {
		return 2*(l+w);
	}
}
