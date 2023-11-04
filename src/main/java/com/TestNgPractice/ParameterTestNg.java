package com.TestNgPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNg {
	
	@Test
	@Parameters({"myname", "a"})
	public void practiceParameterinTestNg(String myname, int a) {
		System.out.println(myname+a);
	}

}
