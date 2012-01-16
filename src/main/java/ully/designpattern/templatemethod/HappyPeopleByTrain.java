package ully.designpattern.templatemethod;

public class HappyPeopleByTrain extends HappyPeople {

	@Override
	protected void travel() {
		System.out.println("travel by train");
	}

}
