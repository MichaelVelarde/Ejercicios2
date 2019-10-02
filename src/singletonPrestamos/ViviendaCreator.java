package singletonPrestamos;

public class ViviendaCreator extends Creator {
	
	@Override
	public Vivienda factoryMethodProduct() {
		Vivienda cred = new Vivienda();
		Prestamo pres =  new Prestamo();
		cred.setPrestamo(pres);
		
		return cred;
	}
}