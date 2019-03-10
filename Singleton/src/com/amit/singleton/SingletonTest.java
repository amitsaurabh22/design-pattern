package com.amit.singleton;


import org.junit.Assert;
import org.junit.Test;




public class SingletonTest {

	@Test
	public void test() {

Singleton ins1 = Singleton.getInstance();
Singleton ins2 = Singleton.getInstance();
ins1.setValue(5);

Assert.assertEquals("check the value", ins1.getValue(), ins2.getValue(), ins1.getValue()-ins2.getValue());
	}

}
