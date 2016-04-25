public class PersonDiretor {
	public Person constructPerson(PersonBuilder pb)
	{
		pb.buildHead();
		pb.buildFoot();
		pb.buildBoby();
		return pb.buildPerson();
	}
}