import java.util.ArrayList;
import java.util.List;

public class Stable {
	String address;
	public static List<Horse> horses = new ArrayList<Horse>();

	public Stable(Horse horse) {
		horses.add(horse);
	}

	public Stable() {
		
	}

	public void Display() {
		// int i=0;
		for (int i = 0; i < horses.size(); i++) {

			System.out.println("Horse #" + (i + 1) + "  Name:" + horses.get(i).getName() + "  Weight: "
					+ horses.get(i).getWeight() + "  Tame:" + horses.get(i).getTame());

		}
	}

}
