import  java.util.*;
public abstract class Citizen {
	List<Policeman> pols;
	String help="normal";
	public void setHelp(String help)
	{
		this.help=help;
	}
	public String getHelp()
	{
		return this.help;
	}
	abstract void sendMessage(String help);
	public void setPolicemen(){
		this.pols=new ArrayList<Policeman>();
	}
	public void resigter(Policeman pol)
	{
		this.pols.add(pol);
	}
	public void unResigter(Policeman pol)
	{
		this.pols.remove(pol);
	}
}