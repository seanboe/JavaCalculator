
public class VariableNotDeclaredException extends Exception {

	public VariableNotDeclaredException() {
		super("Variable not declared");
	}
	
	public VariableNotDeclaredException(String var) {
		super("Variable " + var + " not declared");
	}
	
}
