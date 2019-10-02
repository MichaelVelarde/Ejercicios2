package mediator;

public abstract class Desa {
	protected Mediator mediator;
	public Desa(Mediator mediator) {this.mediator=mediator;}
	public abstract void send(String msg);
	public abstract void messageReceived(String msg,int num,int num2);
}
