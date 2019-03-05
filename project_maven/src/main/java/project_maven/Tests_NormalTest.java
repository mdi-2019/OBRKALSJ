package project_maven;

import org.junit.Assert;
import org.junit.Test;



public class Tests_NormalTest {

	@Test
	public void testAddZero() {
		int res = Normal.add(0,0);
		
		Assert.assertEquals(res, 0);
	}
	
	@Test
	public void testAdd1() {
		int res = Normal.add(1, 1);
		int res2 = Normal.add(res, 1);
		
		Assert.assertEquals(res2,3);
	}
	
	@Test
	public void testAdd2() {
		int res = Normal.add(2, -1);
		
		Assert.assertEquals(res, 1);
	}
	
	
	

}
