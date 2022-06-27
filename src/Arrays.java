import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		int[] givenArray = {9,20,25,14,7,16,45};
		int sum = 0;
		for(int i=0; i < givenArray.length; i++ ) 
			sum = sum + givenArray[i] ;
		System.out.println("The sum of all the values of givenArray is: " + sum);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = input.nextInt();
		System.out.println("Enter the power: ");
		int power = input.nextInt();
		double[] newArray = toPower(size, power);
		for( int i = 0; i < newArray.length; i++) {
			int element = (int) newArray[i]; 
			System.out.print(element + ", ");
		}
		
	

	}



	public static double[] toPower(int size, int power) {
		double[] specialArray = new double[size];
		for(int i = 0; i< size; i++) {
			specialArray[i] = Math.pow(i, power);
		}
		return specialArray;
	}
	
	
}