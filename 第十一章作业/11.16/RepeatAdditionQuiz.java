import java.util.Scanner;
public class RepeatAdditionQuiz {
		// TODO Auto-generated method stub
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        public void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + "+" +number2 + "? ");
        int answer = input.nextInt();
        while(number1 + number2 != answer) {
        	System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 +"? ");
        	answer = input.nextInt();
        }
        System.out.println("You got it!");
	}

}
