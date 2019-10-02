package mediator;

import java.util.HashMap;
import java.util.Map.Entry;

public class ConcreteMediator implements Mediator {
	
	HashMap<Integer,Desa> map= new HashMap<>();

	public void addDeveloper(Desa dev, int num) {
		map.put(num, dev);
	}

	
	@Override
	public void send(String msg, int desarrollador1, int desarrollador2) {
		if(desarrollador2==999) {
			for (Entry<Integer, Desa> entry : map.entrySet()) {
				if (entry.getKey()!=desarrollador1) {
					entry.getValue().messageReceived(msg, desarrollador1, entry.getKey());
				}
				
			}
		}else {
			map.get(desarrollador2).messageReceived(msg, desarrollador1,desarrollador2);
		}
		
	}

}
