public class Test {
	public static void main(String[] args) {
		PersonDiretor pd=new PersonDiretor();
		Person person=pd.constructPerson(new ManBuilder());
		System.out.println(person.getBody());
		System.out.println(person.getHead());
		System.out.println(person.getFoot());
	}
}