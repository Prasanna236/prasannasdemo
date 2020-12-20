package org.Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Runner {

	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses(Employee.class, Company.class);
		System.out.println(r.getRunCount());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunTime());// milli seconds
		System.out.println(r.getFailureCount());

		List<Failure> f = r.getFailures();

		for (Failure x : f) {
			System.out.println(x);
		}
	}

}
