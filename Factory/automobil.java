package factory;

abstract class automobil{
	 
	 private String naziv;
	 private double motor;
	 
	 public void setNaziv(String ime){
		 naziv = ime;
	 }
	 public String getNaziv(){
		 return naziv;
	 }
	 public void setMotor(double jacina){
		 motor = jacina;
	 }
	 public double getMotor(){
		 return motor;
	 }
	 
	 public void informacije (){
		 System.out.println("Specifikacija automobila je : 1)Naziv: " + getNaziv() + " 2)Motor snage: " + getMotor());
	 }
}