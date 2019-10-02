package interpreter;

public class Corchete extends AbstractExpresion{
	
	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith(context.input)) {
			String aux="";
			int cont=0;
			while (context.input.charAt(cont)!= ']') {
				aux= aux + context.input.charAt(cont);
				cont++;
			}
			aux= aux + "]";
			context.output = context.output + aux;
			context.input = context.input.substring(aux.length());
		}
	}

}