import java.util.Scanner;
public class LinearEquationDemo {

	public static void main(String[] args) {
		double x1,x2,x3,x4,y1,y2,y3,y4;
		double a,b,c,d,e,f;
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner input = new Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		a = y1 - y2;
		b = x1 - x2;
		c = y3 - y4;
		d = x3 - x4;
		e = (y1 - y2) * x1 - (x1 - x2) * y1;
		f = (y3 - y4) * x3 - (x3 - x4) * y3;
		LinearEquation LinearEquation1 = new LinearEquation(a,b,c,d,e,f);
		if(LinearEquation1.isSolvable(a,b,c,d)==false) {
			System.out.println("The two lines are parallel");
		}
		else {
			System.out.println("The intersecting point is at (" + LinearEquation1.getX(a,b,c,d,e,f) + " , " + LinearEquation1.getY(a,b,c,d,e,f) + ")");
		}
		}

}
