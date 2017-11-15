
public class TestaEmissores {
	public static void main(String[] args) {
/*		Emissor emissor1 = new EmissorSMS();
		emissor1.envia("k19 SMS");
		
		Emissor emissor2 = new EmissorJMS();
		emissor2.envia("k19 jms");
		
		Emissor emissor3 = new EmissorEmail();
		emissor3.envia("k19 email");
*/	
	EmissorCreator creator = new EmissorCreator();
	
	//SMS
	Emissor emissor1 = creator.create(EmissorCreator.SMS);
	emissor1.envia("k19 SMS");
	
	//Email
	Emissor emissor3 = creator.create(EmissorCreator.EMAIL);
	emissor3.envia("k19 email");
	
	//JMS
	Emissor emissor2 = creator.create(EmissorCreator.JMS);
	emissor2.envia("k19 jms");
	
	
	
	
		
	}

}
