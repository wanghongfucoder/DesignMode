public class Test {
	public static void main(String[] args) {
		Man man=new Man();
		ManDecoratorA md1=new ManDecoratorA();
		ManDecoratorB md2=new ManDecoratorB();
		md1.setPerson(man);
		md2.setPerson(man);
		md1.eat();
		md2.eat();
	}
}