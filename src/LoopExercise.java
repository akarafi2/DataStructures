import java.util.ArrayList;
import java.util.Scanner;

public class LoopExercise {
	public static void main(String[] args) {
		System.out.println("This is working");

		ArrayList<Double> numbers = new ArrayList<>(5);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		numbers.add(input.nextDouble());
		System.out.println("Enter the Second number: ");
		numbers.add(input.nextDouble());
		System.out.println("Enter the Third number: ");
		numbers.add(input.nextDouble());
		System.out.println("Enter the Fourth number: ");
		numbers.add(input.nextDouble());
		System.out.println("Enter the Fifth/Last number: ");
		numbers.add(input.nextDouble());
		System.out.println(numbers);

		double sum = 0;
		double product = 1;
		double largest = 0;
		for (Double number : numbers) {
			sum += number;
			product *= number;
			if (largest < number)
				largest = number;

		}
		double smallest = largest;
		for (Double number : numbers)
			if (smallest > number)
				smallest = number;
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The product of the numbers is: " + product);
		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);

	}

}
