package Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;
@Listeners(ListenerTest.class)
public class SampleTest {
@Test
public void test() {
	System.out.println("Hello");
}
@Test
public void test1() {
	Assert.assertTrue(false);
}
@Test(dependsOnMethods= {"test1"})
public void test2() {
	
	
}
}
