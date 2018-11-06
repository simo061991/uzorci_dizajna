// Prva klasa 'suprotnoSingleton' prikazuje način rada koji se razlikuje od Singleton principa, to jest stvara više instanci
// Druga klasa 'singletonPrimjer' objašnjava princip rada Singleton design pattern-a 
// Treca klasa 'Singleton' sadrži main metodu te omogućava instanciranje objekata prethodne dvije klase
// Rezultat je : a) jedna instanca iz klase 'singletonPrimjer' i b) više instanci iz klase 'suprotnoSingleton'



class suprotnoSingleton{
	static suprotnoSingleton instanca = null;
	public static suprotnoSingleton dohvatanjeInstance() {
			instanca = new suprotnoSingleton();			
		return instanca;
	}
}
 class singletonPrimjer {
	private static singletonPrimjer instanca = null;
	private singletonPrimjer(){	
	}
	
	public static singletonPrimjer dohvatanjeInstance() {
		if(instanca == null){
			instanca = new singletonPrimjer();			
		}
		return instanca;
	}
}
public class singleton {
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

