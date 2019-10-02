package singletonPrestamos;

public class Negocios implements IProduct {
	Prestamo prestamo;
	
	
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public Negocios() {
		
	}
	@Override
	public void create() {
		
	}
}