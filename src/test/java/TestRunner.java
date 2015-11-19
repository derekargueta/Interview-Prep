package test.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by derek on 11/18/15.
 */
public class TestRunner {
    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful() ? "All tests passed" : result.getFailureCount() + " tests failed");
        System.out.println(result.getIgnoreCount() + " tests were ignored");
        System.out.println("Ran " + result.getRunCount() + " test in " + (result.getRunTime() / 1000.0) + " seconds");
    }
}
