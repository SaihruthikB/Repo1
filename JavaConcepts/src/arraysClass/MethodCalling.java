package arraysClass;

public class MethodCalling {
	
	public static int MethodCall(int a, int b, int c)
	{
		int sum = a+b+c;
		return sum;
	}
	
  public static void main(String[] args) {
	int answer =MethodCall(6, 1, 2);
	System.out.println(answer);
	
}
}
