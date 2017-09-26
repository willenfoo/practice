package designpattern.decorate.headfirst.coffee;

import designpattern.decorate.headfirst.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	public double cost() {
		return .99;
	}
}

