
public class RegularPolygonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("perimeter is " + p1.getPerimeter() + ", area is " + p1.getArea());
		System.out.println("perimeter is " + p2.getPerimeter() + ", area is " + p2.getArea());
		System.out.println("perimeter is " + p3.getPerimeter() + ", area is " + p3.getArea());

	}

}
