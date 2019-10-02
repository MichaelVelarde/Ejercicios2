package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IteratorBancoDList implements Iterator {
	Stack<Clientes> cliente;
	
	public IteratorBancoDList(Stack<Clientes> cliente) {
		this.cliente = cliente;	
	}
	@Override
	public Object next() {
		return cliente.pop();
	}
	@Override
	public boolean hasNext() {
		return !cliente.empty();
	}
}