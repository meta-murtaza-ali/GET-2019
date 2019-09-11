package Employee;

/**
 * @author Murtaza Ali
 * EmployeeCarDetail POJO Class.
 */
public class EmployeeCarDetail {
	public int employeeId;
	public String carName;
	public String vehicleType;
	public String vehicleNumber;
	public String passType;
	public String passPrice;
	/**
	 * @param employeeId
	 * @param carName
	 * @param vehicleType
	 * @param vehicleNumber
	 * @param passType
	 * @param passPrice
	 */
	public EmployeeCarDetail(int employeeId, String carName, String vehicleType, String vehicleNumber, String passType,
			String passPrice) {
		this.employeeId = employeeId;
		this.carName = carName;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.passType = passType;
		this.passPrice = passPrice;
	}
	/**
	 * 
	 */
	public EmployeeCarDetail() {
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	/**
	 * @param vehicleNumber the vehicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	/**
	 * @return the passType
	 */
	public String getPassType() {
		return passType;
	}
	/**
	 * @param passType the passType to set
	 */
	public void setPassType(String passType) {
		this.passType = passType;
	}
	/**
	 * @return the passPrice
	 */
	public String getPassPrice() {
		return passPrice;
	}
	/**
	 * @param passPrice the passPrice to set
	 */
	public void setPassPrice(String passPrice) {
		this.passPrice = passPrice;
	}

}
