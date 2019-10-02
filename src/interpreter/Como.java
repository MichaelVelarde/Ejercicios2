package interpreter;

public class Como extends AbstractExpresion{
	
	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("como")) {
			context.output = context.output + " Given ";
			context.input = context.input.substring(4);
		}
		
	}

}