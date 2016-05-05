public class Test {
	public static void main(String[] args) {
		Policeman thPol=new TianHePoliceman();
		Policeman hpPol=new HuanPuPoliceman();
		Citizen citizen=new HuanPuCitizen(hpPol);
		citizen.sendMessage("unnormal");
		citizen.sendMessage("normal");
		System.out.println("==========");
		citizen=new TianHeCitizen(thPol);
		citizen.sendMessage("normal");
		citizen.sendMessage("unnormal");
	}
}