package partner;

public class Partner {
	
	String name;
	Partner partner;
	
	public String getName(){
		return name;
	}
	
	public Partner getPartner(){
		return partner;
	}
	
	
	public void setPartner(Partner partner2){
		//sjekk om koblingen er riktig allerede
		if (this.partner == partner2){
			return;
		}
		//husk den gamle og sett den nye
		Partner oldPartner = this.partner;
		this.partner = partner2;
		//koble eventuelt den gamle fra
		if (oldPartner != null && oldPartner.getPartner() == this){
			oldPartner.setPartner(null);
		}
		//koble den andre til
		if (this.partner != null){
			partner2.setPartner(this);
		}
	}
	
	Partner(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Partner [name=" + name + ", partner=" + (partner == null ? "Singel" : partner.getName() ) + "]";
	}

	
}
