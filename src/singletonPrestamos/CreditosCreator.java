package singletonPrestamos;



public class CreditosCreator extends Creator {
	
	@Override
	public Creditos factoryMethodProduct() {
		Creditos cred = new Creditos();
		Prestamo pres =  new Prestamo();
		cred.setPrestamo(pres);
		
		return cred;
	}

}

