public class Test {
	public static void main(String[] args) {
		FlyWeight fly1=FlyWeightFactory.getFlyWeight("a");
		fly1.action(1);
		FlyWeight fly2=FlyWeightFactory.getFlyWeight("a");
		System.out.println(fly1==fly2);
		FlyWeight fly3=FlyWeightFactory.getFlyWeight("c");
		fly3.action(3);
		FlyWeight fly4=FlyWeightFactory.getFlyWeight("d");
		fly4.action(4);
		FlyWeight fly5=FlyWeightFactory.getFlyWeight("e");
		fly5.action(5);
	}
}