package singletonPrestamos;

public class Vivienda implements IProduct {
	Prestamo prestamo;
	
	
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public Vivienda() {
		
	}
	@Override
	public void create() {
		
	}
}