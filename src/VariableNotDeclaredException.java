
public class VariableNotDeclaredException extends Exception {

	public VariableNotDeclaredException() {
		super("Variable not declared");
	}
	
	public VariableNotDeclaredException(String var) {
		super(String.format("Variable '%s' not declared", var));
	}
	
}
