package CoreJavaBasics;

public abstract class AbstrClassDemo {
	public void airlinesafety() {
		System.out.println("follow safety guidelines");
	}
	public void engine() {
		System.out.println("check engine");
	}
	public abstract void color();
	//public abstract void size();
    public void override() {
    	System.out.println("method in parent class which will be overrideen now ");
    }
}
