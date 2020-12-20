package org.Junit;

import org.junit.Ignore;
import org.junit.Test;

public class Company {

	@Test
	public void sc4() {
		System.out.println("Scenario-04");
	}

	@Ignore
	@Test
	public void sc5() {
		System.out.println("Scenario-05");
	}

	@Ignore
	@Test
	public void sc6() {
		System.out.println("Scenario-06");
	}

}
