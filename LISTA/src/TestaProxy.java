
public class TestaProxy {

	public static void main(String[] args) {
		
		boolean ativo=false;
		
		Sistema sistemaReal = new SistemaReal();
		Sistema sistemaProxy = new SistemaProxy(sistemaReal);
		SistemaProxy sistemaProxy2 = new SistemaProxy(sistemaReal);
		
		sistemaProxy.mostrarServicos(1);
		sistemaProxy.escolherArquivo("ARQUIVO X");

		sistemaProxy2.validaUsuario(ativo);
		//sistemaProxy.retornaUrl();		

	}

}
