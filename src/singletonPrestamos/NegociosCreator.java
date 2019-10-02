package singletonPrestamos;

public class NegociosCreator extends Creator {
	
	@Override
	public Negocios factoryMethodProduct() {
		Negocios cred = new Negocios();
		Prestamo pres =  new Prestamo();
		cred.setPrestamo(pres);
		
		return cred;
	}
}