package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Employee {
	
	
	@Test
	public void sc1() {
		Assert.assertEquals("Validate the VISA card", "VISA", "Visa");
		System.out.println("Scenario-01");
	}
	
	@Test
	public void sc3() {
		System.out.println("Scenario-03");
	}
	

	@Test
	public void sc2() {
		System.out.println("Scenario-02");
	}

}
