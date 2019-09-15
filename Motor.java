package wellington;

public interface Motor {
	
	/** change front wheel angle. This method knows how much additional change in angle is required from the previous 
	 *  angle
	 * @param bearing
	 */
	void changeAngle(int prvAngle, int newAngle);
	
	/**
	 * adjust back wheels
	 */
	void adjustWheels();



	
	/**
	 * push the device to new position
	 */
	void pushToNewPosition();
	
	
}
