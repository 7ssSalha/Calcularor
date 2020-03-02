package cal;

import static org.junit.Assert.*;

import org.junit.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import cal.Calculator;

@SuppressWarnings("unused")
public class Testcase {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(c.add(2,3),5);
		
	}

}
