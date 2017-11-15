
public class EmissorCreator {

	public static final int VISA = 0;
	public static final int MASTER = 1;
	
	public Emissor create(int tipoDoEmissor) {
		if(tipoDoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if (tipoDoEmissor == EmissorCreator.MASTER) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException("tipo invalido");
		}
	}

}
