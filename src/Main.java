
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function num1 = new Function(5);
		Function num2 = new Function("y");
		
		Function.setVariable("y", 2);
		
		Function actual = new Function(num1, num2, "/");
		
		try {
			System.out.println(actual.compute());
		} catch (VariableNotDeclaredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
