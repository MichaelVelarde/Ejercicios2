package iterator;

public class IteratorBancoAList implements Iterator {
	
	private int position;
	private Clientes [] cliente;
	
	public IteratorBancoAList(Clientes [] cliente) {
		this.cliente = cliente;
	}
	@Override
	public Object next() {
		return cliente[position++];
	}
	@Override
	public boolean hasNext() {
		return cliente.length!=0 && position <cliente.length;
	}

}