import java.util.Scanner;
import java.util.ArrayList;

public class Sleep {
	
	public Sleep()
		{
		Scanner input = new Scanner(System.in);
		System.out.println("How many values would you like to generate?     ");
		int n = input.nextInt(); // the number is stored in n
		// make a loop that adds a random number

		ArrayList<Integer> values = new ArrayList<>();

		for (int i = 0; i < n; i++)
			values.add((int) (Math.random() * 100));

		//make an empty list to hold the sorted values
		ArrayList <Integer> finalList =  new ArrayList<>();
		
		System.out.println("\nOriginal list: ");
		for (int x : values) {
			System.out.println(x + "  ");

			// Spawn and start a new thread for this value
			SleepThread st = new SleepThread(x, finalList);
			Thread t = new Thread(st);
			t.start (); 

		}

		try { Thread.sleep(11000);}
		catch (Exception e) {}
		System.out.println(values);
		System.out.println(finalList);
	}

	public static void main(String[] args) {
		new Sleep();
	}

}
