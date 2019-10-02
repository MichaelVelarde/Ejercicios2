package interpreter;

import java.util.ArrayList;


public class Parser  {
	private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
	private Context context;
	public Parser(String s) {
		context = new Context(s.replace(" ", ""));
		
		for(String token : s.split(" ")) {
			token = token.toLowerCase();
			switch(token) {
			case "como":
				parseTree.add(new Como());
				break;
			case "quiero":
				parseTree.add(new Quiero() );
				break;
			case "para":
				parseTree.add(new Para() );
				break;
			default:
				parseTree.add(new Corchete());
				break;
			}
			
		}
	}
		public String evaluate() {
			for(AbstractExpresion e : parseTree)
				e.interpreter(context);
			return context.output;
		}
	} 