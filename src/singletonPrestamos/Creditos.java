package singletonPrestamos;

public class Creditos implements IProduct {
	Prestamo prestamo;
	
	
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public Creditos() {
		
	}
	@Override
	public void create() {
		
	}
}