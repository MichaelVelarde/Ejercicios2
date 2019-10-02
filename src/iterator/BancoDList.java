package iterator;

import java.util.Stack;
import java.util.Vector;

public class BancoDList implements Ilist {
	Stack<Clientes> cliente;
	
	public BancoDList() {
		cliente = new Stack<>();
	}
	public void add(Clientes value) {
		cliente.push(value);
	}
	@Override
	public IteratorBancoDList iterator() {
		return new IteratorBancoDList(this.cliente);
	}

}
