public abstract  class Command 
{
	protected  Receiver recevier;
	public Command(Receiver recevier){
		this.recevier=recevier;
	}
	public abstract void execute();	
}