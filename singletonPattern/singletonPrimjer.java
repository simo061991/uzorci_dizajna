public class singletonPrimjer {
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
