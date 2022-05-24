public class OperatorOnlyException extends Exception{
  public OperatorOnlyException() {
    super("The function is only an operator and nothing else");
  }
}
