package zsq_test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class part1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		part1 a=new part1();
		assertEquals(6,a.sum(new double[] {1,2,3}));
		assertEquals(1.25,a.get_allmean(new double[] {-1,1,2,3}));
		assertEquals(3,a.maxnum(new double[] {1,2,3}));
		assertEquals(1,a.minnum(new double[] {1,2,3}));
		assertEquals(false,a.checkarray_variance(new double[] {1,2,3,4}));
		assertEquals(true,a.checkarray_variance(new double[] {1,1.1,1,0.9}));
		assertEquals(4,a.oddsum_mean(new double[] {1,2,3,4,5,6,7}));
	    assertEquals(99,a.getextrenum(new double[] {1,2,3,4,9,100}));
		
	}

}
