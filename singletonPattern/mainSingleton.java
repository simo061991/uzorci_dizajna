public class mainSingleton {
	public static void main(String[] args) {
		singletonPrimjer instanca1 = singletonPrimjer.dohvatanjeInstance();
		singletonPrimjer instanca2 = singletonPrimjer.dohvatanjeInstance();
		suprotnoSingleton instanca3 = suprotnoSingleton.dohvatanjeInstance();
		suprotnoSingleton instanca4 = suprotnoSingleton.dohvatanjeInstance();
		
		System.out.println(instanca1.dohvatanjeInstance());
		System.out.println(instanca2.dohvatanjeInstance());
		System.out.println(instanca3.dohvatanjeInstance());
		System.out.println(instanca4.dohvatanjeInstance());
	}
}


