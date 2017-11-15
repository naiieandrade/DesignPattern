
public class TesteVisaComunicadorFactory {

	public static void main(String[] args) {
		ComunicadorFactory comunicador = new VisaComunicadorFactory();

		String transacao = "Valor = 500; Senha = 123";
		Emissor emissor = comunicador.createEmissor();
		emissor.envia(transacao);

		Receptor receptor = comunicador.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);

	}

}
