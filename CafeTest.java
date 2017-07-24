//test cafe class

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {
	//can brew expresso?
	//tell the IDE that this is a test method, annotate with test annotation
	
	@Test 
	public void canBrewEspresso () {
		
		//instantiate a cafe object:: given clause
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		
		//call brew method and pass in coffee type:: when clause since passing paramter
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		//then clause		
		//test the input is correct-- make sure it is an espresso, make sure it doesnt have milk, and have enough milk
		Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
		Assert.assertEquals (0, coffee.getMilk());
		Assert.assertEquals (7, coffee.getBeans());
	}
	
	@Test 
	public void brewingEspressoConsumeBeans() {
		//given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		//when
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		//then
		Assert.assertEquals (0, cafe.getBeansInStock());
	}
		
}
