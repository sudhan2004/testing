package com.example.testing.day7;
import org.junit.Before;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class day7_2 {
	int a = 20;
	int b = 10;
	
	@Test(priority = 1)
	public void add()
	{
		int sum = a+b;
		Assert.assertEquals(sum, 30);
	}
	
	@Test(priority = 2)
	public void divide()
	{
		int div = a/b;
		Assert.assertEquals(div, 2);
	}
	
	@Test(priority = 3)
	public void multiply()
	{
		int mul = a*b;
		Assert.assertEquals(mul, 200);
	}
	
	@Test(priority = 4)
	public void subtract()
	{
		int sub = a-b;
		Assert.assertEquals(sub, 10);
	}
}
