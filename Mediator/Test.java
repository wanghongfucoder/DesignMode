public class Test
{
	public static void main(String[] args) {
			Mediator me=new ConcreteMediator();
			me.notice("boss");
			me.notice("client");
		}	
}