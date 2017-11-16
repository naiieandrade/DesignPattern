import java.util.Calendar;

public interface BoletoBuilder {
	
	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(double valor);
	void buildVencimento (Calendar vendcimento);
	void buildNossoNumero(int nossoNumero);
	
	Boleto getBoleto();

}
