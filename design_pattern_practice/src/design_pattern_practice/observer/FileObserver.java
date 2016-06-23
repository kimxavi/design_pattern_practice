package design_pattern_practice.observer;

public class FileObserver extends Observer  {
	public FileObserver(MyValue subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("File : " + subject.getState());
	}
}
