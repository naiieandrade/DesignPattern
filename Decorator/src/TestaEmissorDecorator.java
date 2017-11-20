
public class TestaEmissorDecorator {

	public static void main(String[] args) {
		String mensagem = "teste";
		
		Emissor emissorCrip = new EmissorDecoratorCriptografia(new EmissorBasico());
		emissorCrip.envia(mensagem);
		
		Emissor emissorComp = new EmissorDecoratorCompressao(new EmissorBasico());
		emissorComp.envia(mensagem);
		
		Emissor emissorCripComp = new EmissorDecoratorCriptografia(new EmissorDecoratorCompressao(new EmissorBasico()));
		emissorCripComp.envia(mensagem);
				

	}

}
