package interpreter;

public class Quiero extends AbstractExpresion{
	
	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("quiero")) {
			context.output = context.output + " When ";
			context.input = context.input.substring(6);
		}
		
	}

}