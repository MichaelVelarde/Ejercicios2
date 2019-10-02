package singletonPrestamos;

public class Prestamo {
	private double monto;
	public Prestamo(){
		FondosBanco.getUniqueInstance();
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		FondosBanco b = FondosBanco.getUniqueInstance();
		b.getPlata(monto);
		this.monto = monto;
	}

}
