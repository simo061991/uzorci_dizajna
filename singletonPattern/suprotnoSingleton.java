
public class suprotnoSingleton {
	 static suprotnoSingleton instanca = null;
	public static suprotnoSingleton dohvatanjeInstance() {
			instanca = new suprotnoSingleton();			
		return instanca;
	}
}
