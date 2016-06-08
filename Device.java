package wellington;
public interface Device {
	/**
	 * Sets the angle of the front wheel in degrees. Zero is
	 * straight ahead (centered), negative angles point the front wheel
	 * to the left of center and positive angles point the front wheel
	 * to the right of center.
	 */
	void setFrontWheelAngle(int angleDegrees);
	/**
	 * Returns the current direction of travel (bearing) of the robot in
	 * degrees (as reported by a digital compass). Values are from 0 to 359.
	 */
	int getCurrentCompassBearing();
	
	/**
	 * Adjust the back wheels position 
	 */
	void adjustPosition();
	
	/**
	 * This method is responsible for making final move.
	 */
	void move();
	
}