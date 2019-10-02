package iterator;

import java.util.HashMap;

public class EmpresaSoft implements Ilist {
	private int position;
	private HashMap <Integer,Clientes>  cliente ;
	
	public EmpresaSoft() {
		position=0;
		cliente = new HashMap <Integer,Clientes>();
	}
	public void add(Clientes  cliente) {
		this.cliente.put(position, cliente);
		position++;
	}
	@Override
	public EmpresaSoftList iterator() {
		return new EmpresaSoftList(this.cliente);
	}

}