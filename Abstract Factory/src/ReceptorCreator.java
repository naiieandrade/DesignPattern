
public class ReceptorCreator {
	
	public static final int VISA = 0;
	public static final int MASTER = 1;
	
	public Receptor create (int tipoDeReceptor) {
		if (tipoDeReceptor == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		} else if (tipoDeReceptor == ReceptorCreator.MASTER) {
			return new ReceptorMastercard();
		} else {
			throw new IllegalAccessError("Nao suportado");
		}
	}

}
