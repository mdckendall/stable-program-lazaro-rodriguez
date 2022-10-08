import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Stable s = new Stable();
		// Ask the user here
		System.out.println("What is the address of the stable?");
		Scanner scanner = new Scanner(System.in);
		s.address = scanner.nextLine();
		do {
			System.out.println("Do you wish to add a horse to the stable?");
			char input = scanner.next().charAt(0);
			scanner.nextLine();
			if (input == 'y') {
				Horse h;
				System.out.println("What is the name of the horse?");
				String hn = scanner.nextLine();
				System.out.println("What is the weight of the horse?");
				double w = scanner.nextDouble();
				System.out.println("Enter true if the horse is tame or false if it is not.");
				boolean t = scanner.nextBoolean();
				s.horses.add(new Horse(hn, w, t));

			} else {

				break;
			}
		} while (true);
		// Display the info here
		// You code here!
		s.Display();
	}
}
