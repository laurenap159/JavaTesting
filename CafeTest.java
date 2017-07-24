//test cafe class

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {
	//can brew expresso?
	//tell the IDE that this is a test method, annotate with test annotation
	
	@Test 
	public void canBrewEspresso () {
		
		//instantiate a cafe object
		Cafe cafe = new Cafe();
		
		//call brew method and pass in coffee type
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		//test the input is correct-- make sure it is an espresso, make sure it doesnt have milk, and have enough milk
		Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
		Assert.assertEquals (0, coffee.getMilk());
		Assert.assertEquals (7, coffee.getBeans());
	}
	
}