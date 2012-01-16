package ully.designpattern.templatemethod;

/**
 * 通过回调的方式，可以减少随着实现的增多而导致子类增多，产生冗余代码。
 * @author lihan01
 *
 */
public class HappyPeopleCallBack {
	
	public void clelebrateSpringFestival(TravelVehicle vehicle) {
		subscribeTicket();
		vehicle.travel();
		celebrate();
	}

	private void celebrate() {
		System.out.println("Happy new Year!");		
	}

	protected void subscribeTicket() {
		System.out.println("Buy ticket");
	}

}
