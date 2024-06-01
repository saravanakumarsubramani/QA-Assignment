package runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.TestNG;

public class Testrunner {

	public static void main(String[] args) {
		
		    TestNG testng = new TestNG();
	        List<String> suites = new ArrayList<>();
	        suites.add("testng.xml");  
	        testng.setTestSuites(suites);
	        testng.run();
    }
	}


