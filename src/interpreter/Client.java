package interpreter;


public class Client {

	public static void main(String[] args) {
		String toInterpretate = "como [cliente] Para [cliente]";
		System.out.println("Evaluate : "+ toInterpretate + "\n Interpretate : " + new Parser(toInterpretate).evaluate());
		

	}

}
