import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class DemoProjectCTest {

	@Test
	public void circumferenceTest() {
		assertEquals(12.566, (int) (DemoProjectC.circumference(2) * 1000) / 1000.0, 0.0001);
		assertEquals(43.982, (int) (DemoProjectC.circumference(7) * 1000) / 1000.0, 0.0001);
		assertEquals(87.964, (int) (DemoProjectC.circumference(14) * 1000) / 1000.0, 0.0001);
	}

	@Test
	public void areaOfCircleTest() {
		assertEquals(12.566, (int) (DemoProjectC.areaOfCircle(2) * 1000) / 1000.0, 0.0001);
		assertEquals(113.097, (int) (DemoProjectC.areaOfCircle(6) * 1000) / 1000.0, 0.0001);
	}

	@Test
	public void radianToDegreesTest() {
		assertEquals(180.0, (int) (DemoProjectC.radiansToDegrees(Math.PI) * 1000) / 1000.0, 0.0001);
		assertEquals(90.0, (int) (DemoProjectC.radiansToDegrees(Math.PI / 2.0) * 1000) / 1000.0, 0.0001);
		assertEquals(45.0, (int) (DemoProjectC.radiansToDegrees(Math.PI / 4.0) * 1000) / 1000.0, 0.0001);
	}

	@Test
	public void areaOfTriangleTest() {
		assertEquals(6.0, DemoProjectC.areaOfTriangle(3, 4), 0.0001);
		assertEquals(12.0, DemoProjectC.areaOfTriangle(4, 6), 0.0001);
		assertEquals(14, DemoProjectC.areaOfTriangle(4, 7), 0.0001);
	}

	@Test
	public void pythagoreanTheoremTest() {
		assertEquals(5, DemoProjectC.pythagoreanTheorem(3, 4), 0.0001);
		assertEquals(13, DemoProjectC.pythagoreanTheorem(12, 5), 0.0001);
		assertEquals(10, DemoProjectC.pythagoreanTheorem(6, 8), 0.0001);
	}

	@Test
	public void distanceTest() {
		assertEquals(857.5, DemoProjectC.distance(5), 0.0001);
		assertEquals(8.575, DemoProjectC.distance(0.05), 0.0001);
		assertEquals(1.715, DemoProjectC.distance(0.01), 0.0001);
	}

	@Test
	public void minimumAreaTest() {
		assertEquals(36.0, DemoProjectC.minimumArea(1, 3, 5, 9), 0.0001);
		assertEquals(16.0, DemoProjectC.minimumArea(5, 5, 9, 1), 0.0001);
		assertEquals(25.0, DemoProjectC.minimumArea(4, 7, 6, 12), 0.0001);
	}

}