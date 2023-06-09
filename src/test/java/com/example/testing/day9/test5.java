package com.example.testing.day9;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class test5 {
  @Test
  public void FirstMethod() {
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void SecondMethod() {
	  Assert.assertEquals(true, true);
  }
  
}