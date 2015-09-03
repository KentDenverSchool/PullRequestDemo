import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Drew());
		s.add(new Travis());
		s.add(new wmckissick());
		s.add(new Conner());
		s.add(new Niyi(null, null, "Curse you!"));
		s.add(new FahimChoudhury());
		s.add(new Shreyas());
		s.add(new NoahNaiman());
		s.add(new Jake());
		s.add(new Sarah());
		s.add(new Russell());
		s.get(0).sayCatchphrase();
	}
}
