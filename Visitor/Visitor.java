import  java.util.*;
public interface Visitor {
	public void visitString(StringElement stringE);
	public void visitFloat(FloatElement floatE);
	public void visitCollection(Collection collection);
}