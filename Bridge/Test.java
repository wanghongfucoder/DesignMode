public class Test
{
	public static void main(String[] args) {
		Person man=new Man();
		Person lady=new Lady();
		Clothing jacket=new Jacket();
		Clothing trouser=new Trouser();
		// Clothing clothing1=new ClothingFactory(jacket);
		// Clothing clothing2=new ClothingFactory(trouser);
		// clothing1.personDressCloth(man);
		// clothing2.personDressCloth(lady);
		jacket.personDressCloth(man);
		trouser.personDressCloth(man);
		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);
	}
}