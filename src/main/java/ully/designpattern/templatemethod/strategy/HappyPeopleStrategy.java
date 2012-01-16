package ully.designpattern.templatemethod.strategy;

import java.util.List;

import ully.designpattern.templatemethod.TravelVehicle;

/**
 * 通过策略模式，可以有效的降低代码冗余，封装变化
 * @author ully
 *
 */
public class HappyPeopleStrategy {
	
	private List<TravelVehicle> vehicles;
	
	public HappyPeopleStrategy(List<TravelVehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}

	public void clelebrateSpringFestival() {
		subscribeTicket();
		travel();
		celebrate();
	}

	private void travel() {
		for (TravelVehicle vehicle : vehicles) {
			vehicle.travel();
		}
	}

	private void celebrate() {
		System.out.println("Happy new Year!");		
	}

	protected void subscribeTicket() {
		System.out.println("Buy ticket");
	}
}
