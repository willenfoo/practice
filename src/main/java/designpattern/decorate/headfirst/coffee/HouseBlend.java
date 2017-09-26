package designpattern.decorate.headfirst.coffee;


import designpattern.decorate.headfirst.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}
