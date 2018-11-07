package factory;
class tipAutomobila {
	public automobil getTip(String tip){
		if(tip == null){
			return null;
		}
		if(tip.equalsIgnoreCase("AUTOUTRKE")){
			return new autoutrke();
		}
		if(tip.equalsIgnoreCase("OFFROAD")){
			return new offroad();
		}
		return null;
	}
}
