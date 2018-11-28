public class OctalObserver extends Observer{

	OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(){
		System.out.println("Octal observer updated - " + Integer.toOctalString(subject.getState()));
	}
}