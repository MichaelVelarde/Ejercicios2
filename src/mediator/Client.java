package mediator;

public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator= new ConcreteMediator();
		Desa dev1= new Dev(mediator);
		Desa dev2= new Dev(mediator);
		Desa dev3= new Dev(mediator);
		Desa dev4= new Dev(mediator);
		
		mediator.addDeveloper(dev1, 0);
		mediator.addDeveloper(dev2, 1);
		mediator.addDeveloper(dev3, 2);
		mediator.addDeveloper(dev4, 3);
		
		
		mediator.send("esto es un mensaje",1,999);
		mediator.send("esto es un mensaje", 0, 1);


	}

}