public class HuanPuCitizen extends Citizen {
	public HuanPuCitizen(Policeman pol)
	{
		setPolicemen();
		resigter(pol);
	}
	public void sendMessage(String help)
	{
		setHelp(help);
		for (int i=0;i<pols.size();i++ ) {
			Policeman pol=pols.get(i);
			//通知警察行动
			pol.action(this);
		}
	}
}