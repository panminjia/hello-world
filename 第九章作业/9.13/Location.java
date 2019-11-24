
public class Location {
	public int row;
	public int column;
	public double maxValue;
	public void Compare(double n, int i, int j) {
		if(n > maxValue) {
			maxValue = n;
			row = i;
			column = j;
		}
	}

}

