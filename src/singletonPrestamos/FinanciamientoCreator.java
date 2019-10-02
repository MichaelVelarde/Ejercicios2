package singletonPrestamos;

public class FinanciamientoCreator extends Creator {
	
	@Override
	public Financiamiento factoryMethodProduct() {
		Financiamiento cred = new Financiamiento();
		Prestamo pres =  new Prestamo();
		cred.setPrestamo(pres);
		
		return cred;
	}
}