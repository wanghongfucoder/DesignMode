public class ProxySubject extends Subject {
	//以真实角色作为代理的属性
	private  Subject  realSubject;
	public ProxySubject(){}
	//封装真实角色对象的方法
	public void request{
		preRequest();
		if (realSubject==null) {
		realSubject=new RealSubject();	
		}
		realSubject.request();
		postRequest();
	}
}