
public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
    public LinearEquation(double a,double b,double c,double d,double e,double f) {
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	this.d = d;
    	this.e = e;
    	this.f = f;
    }
    public double getA() {
    	return this.a;
    }
    public double getB() {
    	return this.b;
    }
    public double getC() {
    	return this.c;
    }
    public double getD() {
    	return this.d;
    }
    public double getE() {
    	return this.e;
    }
    public double getF() {
    	return this.f;
    }
    public boolean isSolvable(double a,double b,double c,double d) {
    	if((a*d-b*c)!=0) return true;
    	else return false;
    }
    public double getX(double a,double b,double c,double d,double e,double f) {
    	return((e*d-b*f)*1.0)/((a*d-b*c)*1.0);
    }
    public double getY(double a,double b,double c,double d,double e,double f) {
    	return((a*f-e*c)*1.0)/((a*d-b*c)*1.0);
    }
    
}
