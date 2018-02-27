package org.schema;
/**
* A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
*/
public class Vehicle extends Product{
	
	
	/**
	* The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
	 *
	 * Ranges: Text
	 */
	private String _vehicleIdentificationNumber;
	
	public String getVehicleIdentificationNumber() throws ClassCastException{
		return (String) _vehicleIdentificationNumber;
	}
	
	public void setVehicleIdentificationNumber(String value) throws ClassCastException{
		_vehicleIdentificationNumber = value;
	}
	/**
	* The date of the first registration of the vehicle with the respective public authorities.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _dateVehicleFirstRegistered;
	
	public java.util.Date getDateVehicleFirstRegistered() throws ClassCastException{
		return (java.util.Date) _dateVehicleFirstRegistered;
	}
	
	public void setDateVehicleFirstRegistered(java.util.Date value) throws ClassCastException{
		_dateVehicleFirstRegistered = value;
	}
	/**
	* The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.</p>
	
	<p>Typical unit code(s): C62 for persons.
	 *
	 * Ranges: Number, QuantitativeValue
	 */
	private Object _vehicleSeatingCapacity;
	
	public <T> T getVehicleSeatingCapacity(Class<T> c) throws ClassCastException{
		return (T) _vehicleSeatingCapacity;
	}
	
	public void setVehicleSeatingCapacity(Float value) throws ClassCastException{
		_vehicleSeatingCapacity = value;
	}
	public void setVehicleSeatingCapacity(QuantitativeValue value) throws ClassCastException{
		_vehicleSeatingCapacity = value;
	}
	/**
	* The number of doors.</p>
	
	<p>Typical unit code(s): C62
	 *
	 * Ranges: QuantitativeValue, Number
	 */
	private Object _numberOfDoors;
	
	public <T> T getNumberOfDoors(Class<T> c) throws ClassCastException{
		return (T) _numberOfDoors;
	}
	
	public void setNumberOfDoors(QuantitativeValue value) throws ClassCastException{
		_numberOfDoors = value;
	}
	public void setNumberOfDoors(Float value) throws ClassCastException{
		_numberOfDoors = value;
	}
	/**
	* The date the item e.g. vehicle was purchased by the current owner.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _purchaseDate;
	
	public java.util.Date getPurchaseDate() throws ClassCastException{
		return (java.util.Date) _purchaseDate;
	}
	
	public void setPurchaseDate(java.util.Date value) throws ClassCastException{
		_purchaseDate = value;
	}
	/**
	* The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
	 *
	 * Ranges: QualitativeValue, Text, URL
	 */
	private Object _fuelType;
	
	public <T> T getFuelType(Class<T> c) throws ClassCastException{
		return (T) _fuelType;
	}
	
	public void setFuelType(QualitativeValue value) throws ClassCastException{
		_fuelType = value;
	}
	public void setFuelType(String value) throws ClassCastException{
		_fuelType = value;
	}
	/**
	* The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
	 *
	 * Ranges: DriveWheelConfigurationValue, Text
	 */
	private Object _driveWheelConfiguration;
	
	public <T> T getDriveWheelConfiguration(Class<T> c) throws ClassCastException{
		return (T) _driveWheelConfiguration;
	}
	
	public void setDriveWheelConfiguration(DriveWheelConfigurationValue value) throws ClassCastException{
		_driveWheelConfiguration = value;
	}
	public void setDriveWheelConfiguration(String value) throws ClassCastException{
		_driveWheelConfiguration = value;
	}
	/**
	* The date of production of the item, e.g. vehicle.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _productionDate;
	
	public java.util.Date getProductionDate() throws ClassCastException{
		return (java.util.Date) _productionDate;
	}
	
	public void setProductionDate(java.util.Date value) throws ClassCastException{
		_productionDate = value;
	}
	/**
	* The release date of a vehicle model (often used to differentiate versions of the same make and model).
	 *
	 * Ranges: Date
	 */
	private java.util.Date _vehicleModelDate;
	
	public java.util.Date getVehicleModelDate() throws ClassCastException{
		return (java.util.Date) _vehicleModelDate;
	}
	
	public void setVehicleModelDate(java.util.Date value) throws ClassCastException{
		_vehicleModelDate = value;
	}
	/**
	* The total number of forward gears available for the transmission system of the vehicle.</p>
	
	<p>Typical unit code(s): C62
	 *
	 * Ranges: Number, QuantitativeValue
	 */
	private Object _numberOfForwardGears;
	
	public <T> T getNumberOfForwardGears(Class<T> c) throws ClassCastException{
		return (T) _numberOfForwardGears;
	}
	
	public void setNumberOfForwardGears(Float value) throws ClassCastException{
		_numberOfForwardGears = value;
	}
	public void setNumberOfForwardGears(QuantitativeValue value) throws ClassCastException{
		_numberOfForwardGears = value;
	}
	/**
	* The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
	 *
	 * Ranges: Text
	 */
	private String _vehicleInteriorType;
	
	public String getVehicleInteriorType() throws ClassCastException{
		return (String) _vehicleInteriorType;
	}
	
	public void setVehicleInteriorType(String value) throws ClassCastException{
		_vehicleInteriorType = value;
	}
	/**
	* Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
	 *
	 * Ranges: Text
	 */
	private String _vehicleSpecialUsage;
	
	public String getVehicleSpecialUsage() throws ClassCastException{
		return (String) _vehicleSpecialUsage;
	}
	
	public void setVehicleSpecialUsage(String value) throws ClassCastException{
		_vehicleSpecialUsage = value;
	}
	/**
	* A textual description of known damages, both repaired and unrepaired.
	 *
	 * Ranges: Text
	 */
	private String _knownVehicleDamages;
	
	public String getKnownVehicleDamages() throws ClassCastException{
		return (String) _knownVehicleDamages;
	}
	
	public void setKnownVehicleDamages(String value) throws ClassCastException{
		_knownVehicleDamages = value;
	}
	/**
	* <p>The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).</p>
	
	<ul>
	<li>Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use <a class="localLink" href="http://schema.org/unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.</li>
	<li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="http://schema.org/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="http://schema.org/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
	<li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> to link the value for the fuel economy to another value.</li>
	</ul>
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _fuelEfficiency;
	
	public QuantitativeValue getFuelEfficiency() throws ClassCastException{
		return (QuantitativeValue) _fuelEfficiency;
	}
	
	public void setFuelEfficiency(QuantitativeValue value) throws ClassCastException{
		_fuelEfficiency = value;
	}
	/**
	* The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.</p>
	
	<p>Typical unit code(s): LTR for liters, FTQ for cubic foot/feet</p>
	
	<p>Note: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _cargoVolume;
	
	public QuantitativeValue getCargoVolume() throws ClassCastException{
		return (QuantitativeValue) _cargoVolume;
	}
	
	public void setCargoVolume(QuantitativeValue value) throws ClassCastException{
		_cargoVolume = value;
	}
	/**
	* The number or type of airbags in the vehicle.
	 *
	 * Ranges: Text, Number
	 */
	private Object _numberOfAirbags;
	
	public <T> T getNumberOfAirbags(Class<T> c) throws ClassCastException{
		return (T) _numberOfAirbags;
	}
	
	public void setNumberOfAirbags(String value) throws ClassCastException{
		_numberOfAirbags = value;
	}
	public void setNumberOfAirbags(Float value) throws ClassCastException{
		_numberOfAirbags = value;
	}
	/**
	* Information about the engine or engines of the vehicle.
	 *
	 * Ranges: EngineSpecification
	 */
	private EngineSpecification _vehicleEngine;
	
	public EngineSpecification getVehicleEngine() throws ClassCastException{
		return (EngineSpecification) _vehicleEngine;
	}
	
	public void setVehicleEngine(EngineSpecification value) throws ClassCastException{
		_vehicleEngine = value;
	}
	/**
	* The total distance travelled by the particular vehicle since its initial production, as read from its odometer.</p>
	
	<p>Typical unit code(s): KMT for kilometers, SMI for statute miles
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _mileageFromOdometer;
	
	public QuantitativeValue getMileageFromOdometer() throws ClassCastException{
		return (QuantitativeValue) _mileageFromOdometer;
	}
	
	public void setMileageFromOdometer(QuantitativeValue value) throws ClassCastException{
		_mileageFromOdometer = value;
	}
	/**
	* The number of owners of the vehicle, including the current one.</p>
	
	<p>Typical unit code(s): C62
	 *
	 * Ranges: Number, QuantitativeValue
	 */
	private Object _numberOfPreviousOwners;
	
	public <T> T getNumberOfPreviousOwners(Class<T> c) throws ClassCastException{
		return (T) _numberOfPreviousOwners;
	}
	
	public void setNumberOfPreviousOwners(Float value) throws ClassCastException{
		_numberOfPreviousOwners = value;
	}
	public void setNumberOfPreviousOwners(QuantitativeValue value) throws ClassCastException{
		_numberOfPreviousOwners = value;
	}
	/**
	* The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
	 *
	 * Ranges: Text, URL, QualitativeValue
	 */
	private Object _vehicleTransmission;
	
	public <T> T getVehicleTransmission(Class<T> c) throws ClassCastException{
		return (T) _vehicleTransmission;
	}
	
	public void setVehicleTransmission(String value) throws ClassCastException{
		_vehicleTransmission = value;
	}
	public void setVehicleTransmission(QualitativeValue value) throws ClassCastException{
		_vehicleTransmission = value;
	}
	/**
	* <p>The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).</p>
	
	<ul>
	<li>Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use <a class="localLink" href="http://schema.org/unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.</li>
	<li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="http://schema.org/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="http://schema.org/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
	<li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> to link the value for the fuel consumption to another value.</li>
	</ul>
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _fuelConsumption;
	
	public QuantitativeValue getFuelConsumption() throws ClassCastException{
		return (QuantitativeValue) _fuelConsumption;
	}
	
	public void setFuelConsumption(QuantitativeValue value) throws ClassCastException{
		_fuelConsumption = value;
	}
	/**
	* The position of the steering wheel or similar device (mostly for cars).
	 *
	 * Ranges: SteeringPositionValue
	 */
	private SteeringPositionValue _steeringPosition;
	
	public SteeringPositionValue getSteeringPosition() throws ClassCastException{
		return (SteeringPositionValue) _steeringPosition;
	}
	
	public void setSteeringPosition(SteeringPositionValue value) throws ClassCastException{
		_steeringPosition = value;
	}
	/**
	* A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
	 *
	 * Ranges: Text
	 */
	private String _vehicleConfiguration;
	
	public String getVehicleConfiguration() throws ClassCastException{
		return (String) _vehicleConfiguration;
	}
	
	public void setVehicleConfiguration(String value) throws ClassCastException{
		_vehicleConfiguration = value;
	}
	/**
	* The number of axles.</p>
	
	<p>Typical unit code(s): C62
	 *
	 * Ranges: Number, QuantitativeValue
	 */
	private Object _numberOfAxles;
	
	public <T> T getNumberOfAxles(Class<T> c) throws ClassCastException{
		return (T) _numberOfAxles;
	}
	
	public void setNumberOfAxles(Float value) throws ClassCastException{
		_numberOfAxles = value;
	}
	public void setNumberOfAxles(QuantitativeValue value) throws ClassCastException{
		_numberOfAxles = value;
	}
	/**
	* The color or color combination of the interior of the vehicle.
	 *
	 * Ranges: Text
	 */
	private String _vehicleInteriorColor;
	
	public String getVehicleInteriorColor() throws ClassCastException{
		return (String) _vehicleInteriorColor;
	}
	
	public void setVehicleInteriorColor(String value) throws ClassCastException{
		_vehicleInteriorColor = value;
	}
}
