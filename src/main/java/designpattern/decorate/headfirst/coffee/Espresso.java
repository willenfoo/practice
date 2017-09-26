package designpattern.decorate.headfirst.coffee;


import designpattern.decorate.headfirst.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}
}
