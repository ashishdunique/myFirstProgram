##

package wellington;


public interface SteeringControl {
	/**
	 * Connects the controller to the robot hardware.
	 */
	void setDevice(Device device);
	/**
	 * Sets the desired direction of travel using an XML message.
	 */
	void setDirection(String requestDocument);
}
