package iterator;

import java.util.ArrayList;
import java.util.List;


public class IteratorBancoBList implements Iterator {
	
	private int position;
	private List<Clientes> cliente = new ArrayList<>();
	
	public IteratorBancoBList(List <Clientes>  cliente) {
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