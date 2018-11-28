public class BinaryObserver extends Observer{

	BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(){
		System.out.println("Binary observer updated - " + Integer.toBinaryString(subject.getState()));
	}
}