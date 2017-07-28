//INF115 HW3
//Timothy Pranoto
//38964311

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeStructuralTest {
	
	TriangleType t;
	@Before
	public void setUp() throws Exception {
		t=new TriangleType();
	}
	
	@Test
	public void testMinusNumber() {
		assertEquals(4, TriangleType.triangleType(-200, -200, -300));
	}
	
	@Test
	public void testMinusNumber2() {
		assertEquals(4, TriangleType.triangleType(200, 200, -300));
	}
	
	@Test
	public void testMinusNumber3() {
		assertEquals(4, TriangleType.triangleType(200, -200, -300));
	}
	
	@Test
	public void testOutofBound2() {
		assertEquals(5, TriangleType.triangleType(200, 200, 3000));
	}
	
	@Test
	public void testOutofBound3() {
		assertEquals(5, TriangleType.triangleType(2000, 2000, 300));
	}
	@Test
	public void testIsosceles2() {
		assertEquals(2, TriangleType.triangleType(300, 200, 200));
	}
	
	@Test
	public void testIsosceles3() {
		assertEquals(2, TriangleType.triangleType(200, 300, 200));
	}
	
	@Test
	public void testIsosceles4() {
		assertEquals(4, TriangleType.triangleType(800, 300, 300));
	}
	
	@Test
	public void testIsosceles5() {
		assertEquals(4, TriangleType.triangleType(300, 800, 300));
	}
	@Test
	public void testIsoceles6() {
		assertEquals(4, TriangleType.triangleType(200, 200, 600));
	}
	
	@Test
	public void testNotTriangle2() {
		assertEquals(4, TriangleType.triangleType(300, 200, 100));
	}
	
	@Test
	public void testNotTriangle3() {
		assertEquals(4, TriangleType.triangleType(200, 300, 100));
	}
}
