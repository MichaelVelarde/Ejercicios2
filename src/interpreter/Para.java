package interpreter;

public class Para extends AbstractExpresion{
	
	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("para")) {
			context.output = context.output + " Then ";
			context.input = context.input.substring(4);
		}
		
	}

}