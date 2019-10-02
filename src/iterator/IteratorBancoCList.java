package iterator;

import java.util.Vector;

public class IteratorBancoCList implements Iterator {
	
	private int position;
	private Vector <Clientes> cliente;
	
	public IteratorBancoCList(Vector <Clientes>  cliente) {
		this.cliente = cliente;
		this.position=0;
	}
	@Override
	public Object next() {
		return cliente.get(position++);
	}
	@Override
	public boolean hasNext() {
		return position < cliente.size() && cliente.size() != 0;
	}

}