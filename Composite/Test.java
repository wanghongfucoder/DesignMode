import  java.util.*;
public class Test {
	public static void main(String[] args) {
		Employer pm=new ProjectManager("经理");
		Employer pa=new ProjectAssistant("助理");
		Employer p1=new Programmer("码农1");
		Employer p2=new Programmer("码农2");
		pm.add(pa);
		pm.add(p2);
		List<Employer> ems=pm.getEmployers();
		for (Employer em :ems ) {
			System.out.println(em.getName());
		}
	}
}