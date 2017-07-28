//INF115 HW3
//Timothy Pranoto
//38964311

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeFunctionalTest {

	@Test
	public void testScalene() {
		assertEquals(1, TriangleType.triangleType(150, 200, 300));
	}
	
	@Test
	public void testIsosceles() {
		assertEquals(2, TriangleType.triangleType(200, 200, 300));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(3, TriangleType.triangleType(300, 300, 300));
	}
	
	@Test
	public void testNotTriangle() {
		assertEquals(4, TriangleType.triangleType(100, 200, 300));
	}
	
	@Test
	public void testOutofBound() {
		assertEquals(5, TriangleType.triangleType(200, 2000, 300));
	}

}
