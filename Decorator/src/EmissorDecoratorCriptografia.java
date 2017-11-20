
public class EmissorDecoratorCriptografia extends EmissorDecorator {

	public EmissorDecoratorCriptografia(Emissor emissor) {
		super(emissor);
	}
	
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem criptografada: ");
		this.getEmissor().envia(criptografia(mensagem));
	}
	
	public String criptografia(String mensagem) {
		String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
		return mensagemCriptografada;
	}
	

}
