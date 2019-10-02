package singletonPrestamos;



public class Client {

	public static void main(String[] args) {
		
		Creditos a = new CreditosCreator ().factoryMethodProduct();
		Negocios b = new NegociosCreator ().factoryMethodProduct();
		Prestamo pres = new Prestamo();
		
		pres.setMonto(12304);
		a.setPrestamo(pres);
		System.out.println(a.getPrestamo().getMonto());
		pres.setMonto(79892);
		b.setPrestamo(pres);
		System.out.println(b.getPrestamo().getMonto());
		
		FondosBanco aux = FondosBanco.getUniqueInstance();
		System.out.println("Al banco le quedan: " + aux.verPlata());
		

	}

}
