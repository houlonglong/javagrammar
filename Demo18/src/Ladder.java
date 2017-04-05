
public class Ladder{
	double top,bottom,height;
	
	public Ladder(double a ,double b,double h) {
		top = a ;
		bottom = b ;
		height = h;
	}
	double getArea(){
		return (top+bottom)*height/2;
	}
}
