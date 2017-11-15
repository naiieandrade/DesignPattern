
public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Visa.");
		String mensagem = "mensagem da Visa";
		return mensagem;
	}

}
