package partner;

public class PartnerProgram {

	public static void main(String[] args) {
		Partner partner1 = new Partner("Trollet");
		Partner partner2 = new Partner("Prinsessen");
		Partner partner3 = new Partner("Askeladden");
		
		partner1.setPartner(partner3);
		
		System.out.println(partner1);
		System.out.println(partner2);
		System.out.println(partner3);
	}

}
