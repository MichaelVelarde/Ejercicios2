package iterator;

public class BancoAList implements Ilist {
	private int position;
	private Clientes [] cliente;
	public BancoAList() {
		position=0;
		cliente = new Clientes[4];
	}
	public void add(Clientes value) {
		cliente[position]= value;
		position++;
	}
	@Override
	public IteratorBancoAList iterator() {
		return new IteratorBancoAList(this.cliente);
	}

}
