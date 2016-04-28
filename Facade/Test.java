public class Test {
	public static void main(String[] args) {
		ServiceA sa=new ServiceAImpl();
		ServiceB sb=new ServiceBImpl();
		sa.methodA();
		sb.methodB();
		Facade fa=new Facade();
		fa.methodA();
		fa.methodB();
	}
}