
public class Horse {

	String name;
	double weight;
	boolean istame;

	public Horse(String hn, double w, boolean t) {
		// TODO Auto-generated constructor stub
		name = hn;
		weight = w;
		istame = t;
	}

	public String getName() {
		return name;
	}

	public boolean getTame() {
		if (istame == true) {
			return true;
		}
		return false;
	}

	public double getWeight() {
		return weight;
	}

}
