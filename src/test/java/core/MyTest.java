package core;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
	
	}

	@AfterClass
	public static void afterClass() throws Exception {
		
	}

	@Before
	public void beforeMethod() throws Exception {
		
	}

	@After
	public void afterMethod() throws Exception {
		
	}

	@Test
	public void test_01_AssertEquals_Positive() {
		assertEquals("Equal versions of JUnit", "JUnit ver.4.12", MyApp.s);
	}
	
	@Test // @Ignore
	public void test_02_AssertEquals_Negative() {
		assertEquals("Not equal versions of JUnit", "JUnit ver.4.13", MyApp.s);
	}

	@Test
	@Ignore
	public void test_03_AssertEquals_Ignored() {
		assertEquals("Not equal versions of JUnit", "JUnit ver.4.12", MyApp.s);
	}

	@Test // @Ignore
	public void test_04_AssertSame_Positive() {
		assertSame("The value of Integer is the same", 39, MyApp.i);
	}

	@Test // @Ignore
	public void test_05_AssertSame_Negative() {
		assertSame("The value of Integer is not the same", 38, MyApp.i);
	}

	@Test
	@Ignore
	public void test_06_AssertSame_Ignored() {
		assertSame("The value of Integer is not the same", 38, MyApp.i);
	}

	@Test // @Ignore
	public void test_07_AssertFalse_Positive() {
		assertFalse("There is must be false", MyApp.f);
	}

	@Test // @Ignore
	public void test_8_AssertFalse_Negative() {
		assertFalse("There is must be false", MyApp.t);
	}

	@Test // @Ignore
	public void test_09_AssertTrue_Positive() {
		assertTrue("There is must be true", MyApp.t);
	}

	@Test // @Ignore
	public void test_10_AssertTrue_Negative() {
		assertTrue("There is must be true", MyApp.f);
	}

}
