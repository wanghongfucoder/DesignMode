import java.util.*;
public class FlyWeightFactory  {
	private  static  Map flyweights=new HashMap();	
	public FlyWeightFactory(String arg){
		flyweights.put(arg,new FlyWeightImpl());
	}
	public static FlyWeight getFlyWeight(String key){
		if (flyweights.get(key)==null) {
			flyweights.put(key,new FlyWeightImpl());
		}
		return  flyweights.get(key);
	}
	public static int  getSize(){
		return  flyweights.size();
	}
}