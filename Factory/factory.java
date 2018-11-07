package factory;
public class factory {

	public static void main(String[] args) {
		
			tipAutomobila tp = new tipAutomobila();
			automobil auto1 = tp.getTip("autoutrke");
			System.out.println(auto1.getNaziv());
			automobil auto2 = tp.getTip("offroad");
			System.out.println(auto2.getNaziv());
	}

}
