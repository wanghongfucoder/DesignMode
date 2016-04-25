public class Test {
	public static void main(String[] args) {
		IAnimalFactory blackAnimalFactory=new BlackAnimalFactory();
		ICat blackCat=blackAnimalFactory.createCat();
		IDog blackDog=blackAnimalFactory.createDog();
		blackCat.eat();
		blackDog.eat();
		IAnimalFactory whiteAnimalFactory=new WhiteAnimalFactory();
		ICat whiteCat=whiteAnimalFactory.createCat();
		IDog whiteDog=whiteAnimalFactory.createDog();
		whiteCat.eat();
		whiteDog.eat();
	}
}