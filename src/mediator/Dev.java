package mediator;

public class Dev extends Desa {

	public Dev(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageReceived(String msg, int num,int num2) {
		System.out.println("developer "+num2+" received message:\" " +msg+"\" from: "+num);
		
	}

}
