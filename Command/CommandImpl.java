public class CommandImpl extends Command
{
	public CommandImpl(Receiver recevier)
	{
		super(recevier);
	}	
	public void execute(){
		recevier.receive();
	}
}