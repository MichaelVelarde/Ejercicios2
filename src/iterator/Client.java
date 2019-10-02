package iterator;

public class Client {
	public static void main (String [] args) {
		BancoAList listaType1 = new BancoAList();
		listaType1.add(new Clientes("Pedro","achumani"));
		listaType1.add(new Clientes("Juan","Obrajes"));
		
		BancoBList listaType2 = new BancoBList();
		listaType2.add(new Clientes("Pedro2","achumani2"));
		listaType2.add(new Clientes("Juan2","Obrajes2"));
		
		BancoAList listaType3 = new BancoAList();
		listaType1.add(new Clientes("Pedro3","achumani3"));
		listaType1.add(new Clientes("Juan3","Obrajes3"));
		
		
		BancoBList listaType4 = new BancoBList();
		listaType2.add(new Clientes("Pedro4","achumani4"));
		listaType2.add(new Clientes("Juan4","Obrajes4"));
		
		
		EmpresaSoft listaType5 = new EmpresaSoft();
		
		
		Iterator iterator;
		
		iterator = listaType1.iterator();
		while(iterator.hasNext()) {
			Clientes nombre = (Clientes) iterator.next();
			listaType5.add(nombre);
			
		}
		
		iterator = listaType2.iterator();
		while(iterator.hasNext()) {
			Clientes nombre = (Clientes) iterator.next();
			listaType5.add(nombre);
			
		}
		
		iterator = listaType3.iterator();
		while(iterator.hasNext()) {
			Clientes nombre = (Clientes) iterator.next();
			listaType5.add(nombre);
			
		}
		
		iterator = listaType4.iterator();
		while(iterator.hasNext()) {
			Clientes nombre = (Clientes) iterator.next();
			listaType5.add(nombre);
			
		}
		
		iterator = listaType5.iterator();
		while(iterator.hasNext()) {
			Clientes nombre = (Clientes) iterator.next();
			System.out.println("nombre : " + nombre.getNombre());
			System.out.println("direccion : " + nombre.getDireccion());
		}
	}

}