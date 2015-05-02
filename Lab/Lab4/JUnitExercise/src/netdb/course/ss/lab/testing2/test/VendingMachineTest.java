package netdb.course.ss.lab.testing2.test;

import netdb.course.ss.lab.testing2.Drink;
import netdb.course.ss.lab.testing2.IVendingMachine;
import netdb.course.ss.lab.testing2.VendingMachine;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest 
{
	private IVendingMachine vm;
	
	@Before
	public void setup()
	{
		// TODO new your Vending Machine and assign it to vm
		vm = new VendingMachine();
	}
	@After
	public void tearDown()
	{
		vm = null;
	}
	
	@Test
	public void itShouldReturnCorrectDrinkDescription()
	{
		Drink drink = new Drink("Cola");
		vm.addDrink(drink);
		Assert.assertEquals("Cola, id:1", vm.getDrinksDescription()[0]);
	}
	
	
	
	// TODO Implement other test cases
	
	@Test
	public void itShouldReturnCorrectDrinkCount()
	{
		Drink drink1 = new Drink("Cola");
		Drink drink2 = new Drink("Juice");
		Drink drink3 = new Drink("Cola");
		vm.addDrink(drink1);
		vm.addDrink(drink2);
		vm.addDrink(drink3);
		
		Assert.assertEquals(3, vm.getDrinkCount());
	}
	
	@Test
	public void itShouldReturnCorrectDrinkFlavorCount()
	{
		Drink drink1 = new Drink("Cola");
		Drink drink2 = new Drink("Juice");
		Drink drink3 = new Drink("Cola");
		vm.addDrink(drink1);
		vm.addDrink(drink2);
		vm.addDrink(drink3);
		
		Assert.assertEquals(2, vm.getDrinkFlavorCount());
	}
	
	
}
