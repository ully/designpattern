package ully.designpattern.templatemethod;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import ully.designpattern.templatemethod.strategy.HappyPeopleStrategy;

public class HappyPeopleTest {
	
	@Test
	public void testHappyPeopleByTrain(){
		HappyPeople happyPeople = new HappyPeopleByTrain();
		happyPeople.clelebrateSpringFestival();
	}
	
	@Test
	public void testHappyPeopleCallBack(){
		HappyPeopleCallBack happyPeople = new HappyPeopleCallBack();
		happyPeople.clelebrateSpringFestival(new TravelVehicle(){
			public void travel() {
				System.out.println("travel by air");
			}
		});
	}
	@Test
	public void testHappyPeopleStagey(){
		List<TravelVehicle> vehicles = new LinkedList<TravelVehicle>();
		vehicles.add(new TravelVehicle(){
			public void travel() {
				System.out.println("travel by car");
			}
		});
		vehicles.add(new TravelVehicle(){
			public void travel() {
				System.out.println("travel by train");
			}
		});
		HappyPeopleStrategy happyPeople = new HappyPeopleStrategy(vehicles);
		happyPeople.clelebrateSpringFestival();
	}
}
