package com.amit.Singleton;


import org.junit.Assert;
import org.junit.Test;


public class SingletonTest {

	@Test
	public void test() {

		Singleton ins1 = Singleton.INSTANCE;
		Singleton ins2 = Singleton.INSTANCE;
		ins1.setValue(5);
		System.out.println(ins2.getValue());

Assert.assertEquals("check the value", ins1.getValue(), ins2.getValue(), ins1.getValue()-ins2.getValue());
	}

}
