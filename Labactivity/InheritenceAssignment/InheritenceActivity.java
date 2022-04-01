
public class InheritenceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(126534,"peter","chenni India",237844,65000);
		System.out.println("........Manager.......");
		m.calculatesalary();
		m.calculateTransportAllowance();
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("........Trainee.......");
		t.calculatesalary();
		t.calculateTransportAllowance();
	}

}
