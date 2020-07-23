/**
 * More Math / operations practice
 * 
 * 
 * READ HERE for some helpful tips to make your life as a mathematical programmer easier.
 * - To access PI
 * 			- Either create a constant 'PI' by doing: final double PI = 3.14159 ('final' denotes that it's a constant)
 * 			- OR use Math.PI directly in your calculations
 * 
 * - To use exponents
 * 			- Use Math.pow(a, b) where a is the base and b is the power to which it is being raised.
 * 
 * - To find absolute value
 * 			- Use Math.abs(num) - returns absolute value of a number
 * 			- Example Math.abs(2 - 5) ---> 2 - 5 evaluates to -3, which becomes +3 from Math.abs(-3)
 * 
 * - To find the greater of two values
 * 			- Use Math.max(a, b)
 * 
 * - To find the lesser of two values
 * 			- Use Math.min(a, b)
 * 
 * - To find the square root of a number
 * 			- Use Math.sqrt(n) or Math.pow(n, 0.5)
 * 
 * 
 * Good luck, Have fun.
 * 
 * @author Jack Donofrio
 *
 */

public class DemoProjectC {
	
	/**
	 * circumference = 2 * pi * radius
	 * 
	 * @param radius
	 * @return circumference
	 */
	
	public static double circumference(double radius) {
		return 0;
	}
	
	
	/**
	 * area = pi * radius^2
	 * @param radius
	 * @return
	 */
	public static double areaOfCircle(double radius) {
		return 0;
	}
	
	
	/**
	 * 
	 * degrees = radians * 180 / pi
	 * 
	 * @param radians
	 * @return the given number in degrees
	 */
	public static double radiansToDegrees(double radians) {
		return 0;
	}
	
	/**
	 * 
	 * Area of triangle = Base * height / 2
	 * 
	 * @param base
	 * @param height
	 * @return area
	 */
	public static double areaOfTriangle(double base, double height) {
		return 0;
	}
	
	
	/**
	 * Given legs a and b, find hypotenuse c
	 * 
	 * c = (a^2 + b^2)^0.5
	 * 
	 * 
	 * @param leg a
	 * @param leg b
	 * @return hypotenuse c
	 */
	
	public static double pythagoreanTheorem(double a, double b) {
		return 0;
	}
	
	
	/**
	 * (This problem comes from something we will work with when using a particular sensor with Arduino boards)
	 * 
	 * Imagine you have a speaker and a microphone, side by side. The speaker shoots out soundwaves, which hit a 
	 * wall and reflect back to the microphone, as shown in the diagram below.
	 * 
	 * S = speaker
	 * M = microphone
	 * Arrows = sound waves
	 * ||||||||||
	 * |        |
	 * |S ----->|
	 * |M <-----|
	 * |        |
	 * ||||||||||
	 * 
	 * Given:
	 * 		Speed of sound = 343 meters / second
	 * 		Time in seconds between speaker releasing sound and microphone picking it up = time
	 * 		Distance = speed * time
	 * 
	 * Find the distance from the speaker/microphone setup to the wall.
	 * 
	 * Hint: Think hard about what the variable 'time' really represents, as described above, 
	 * and how that relates to the formula distance = speed * time. 
	 * 
	 * @param time
	 * @return distance
	 */
	public static double distance(double time) {
		return 0;
	}	
	
	
	/**
	 * Given two coordinates, (x1, y1) and (x2, y2), write a function that returns
	 * the area of the smallest possible square that encloses both coordinates.
	 * 
	 * Example 1 ->
	 * 			Given coordinates (1,3) and (5, 9)
	 * 			Minimum square area = 36
	 * 
	 * Example 2 ->
	 * 			(5, 2) and (9, 1)
	 * 			Minimum square area = 16
	 * 
	 * Hint: Graphing it out, perhaps on something like desmos.com, will help you visualize
	 * what you have to do much better.
	 */
	public static double minimumArea(double x1, double y1, double x2, double y2) {
		return 0;
	}
}
