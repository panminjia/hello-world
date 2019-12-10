
public class SelectionSort {

	public static void main(String[] args) {
		for(int i = 0;i < list.length - 1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			for(int j = i + i;j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}

	}

}
