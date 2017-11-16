import java.util.Calendar;

public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto() {
		this.boletoBuilder.buildSacado("Marcelo Martins");
		this.boletoBuilder.buildCedente("K19 Treinamentos");
		this.boletoBuilder.buildValor(100.54);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(12334);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
	}

}
