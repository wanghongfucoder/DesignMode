public class TianHePoliceman extends Policeman {
	public void action(Citizen ci)
	{
		String help=ci.getHelp();
		if (help.equals("normal")) {
			System.out.println("一切正常，不用出动");
		}
		if (help.equals("unnormal")) {
			System.out.println("有罪范行为，天河警察出动");
		}
	}
}