package designpattern.decorate.headfirst.flovoring;


import designpattern.decorate.headfirst.Beverage;
import designpattern.decorate.headfirst.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
