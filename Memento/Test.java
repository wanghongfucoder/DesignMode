public  class Test{
	public static void main(String[] args) {
		Originator org=new Originator();
		org.setState("开会中");
		org.showState();
		Caretaker ctk=new Caretaker();
		ctk.setMemento(org.createMemento());
		org.setState("睡觉中");
		org.showState();
		org.setMemento(ctk.getMemento());
		org.showState();
	}
}