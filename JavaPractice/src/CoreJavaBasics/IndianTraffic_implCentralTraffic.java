package CoreJavaBasics;

public class IndianTraffic_implCentralTraffic implements InterfaceDemo_CentralTraffic,ContinentalInterface{

	public static void main(String[] args) {
		
		InterfaceDemo_CentralTraffic	traffic = new IndianTraffic_implCentralTraffic();  // creating object referring to  interface to call methods in interface and cannot be used to call other methods of this class
		traffic.trafficgreen();
		traffic.trafficred();
		traffic.trafficyellow();
		System.out.println(a);
		
		
		IndianTraffic_implCentralTraffic classobj = new IndianTraffic_implCentralTraffic();	// object specific to the class
		classobj. walking();
		
	
		ContinentalInterface interobj = new IndianTraffic_implCentralTraffic();   // obj referring to continental interface 
		interobj.trainSymbol();		
		

	}

	@Override
	public void trafficgreen() {
		System.out.println("green implemented");
		
	}

	@Override
	public void trafficred() {
		System.out.println("red implemented");
		
	}

	@Override
	public void trafficyellow() {
		System.out.println("yellow implemented");
		
	}
	public void walking() {
		System.out.println("walking implemented");
		
	}

	@Override
	public void trainSymbol() {
		System.out.println("trainSymbol implemented");
		
	}



}
