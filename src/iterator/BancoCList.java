package iterator;

import java.util.Vector;

public class BancoCList implements Ilist {
	Vector <Clientes>  cliente;
	public BancoCList() {
		cliente = new Vector<>();
	}
	public void add(Clientes value) {
		cliente.add(value);
	}
	@Override
	public IteratorBancoCList iterator() {
		return new IteratorBancoCList(this.cliente);
	}

}
