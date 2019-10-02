package iterator;

import java.util.ArrayList;
import java.util.List;

public class BancoBList implements Ilist {
	
	private List<Clientes> cliente ;
	
	public BancoBList() {
		cliente = new ArrayList<>();
	}
	public void add(Clientes value) {
		cliente.add(value);
		
	}
	@Override
	public IteratorBancoBList iterator() {
		return new IteratorBancoBList(this.cliente);
	}

}
