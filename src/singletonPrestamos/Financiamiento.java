package singletonPrestamos;



public class Financiamiento implements IProduct {
	Prestamo prestamo;
	
	
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public Financiamiento() {
		
	}
	@Override
	public void create() {
		
	}
}