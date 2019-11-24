import java.util.Scanner;
public class LocationDemo {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows and columns in the array: ");
		Location p1 = new Location();
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column  = input.nextInt();
		System.out.println("Enter the array:");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {		
				double n = input.nextDouble();
				p1.Compare(n, i, j);
			}
		}
		System.out.println("The location of the largest element is " + p1.maxValue +"at (" + p1.row + " " + p1.column +")");
	}

}
