package iterator;

import java.util.HashMap;

public class EmpresaSoftList implements Iterator {
	
	private int position=0;
	private HashMap <Integer,Clientes> cliente = new HashMap <Integer,Clientes>();
	
	public EmpresaSoftList(HashMap <Integer,Clientes> cliente) {
		this.cliente = cliente;
	}
	@Override
	public Object next() {
		return cliente.get(position++);
		
	}
	@Override
	public boolean hasNext() {
		return cliente.size()!=0 && position < cliente.size();
	}

}