package org.schema;
/**
* A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
*/
public interface IVehicle extends IProduct{
	
	
	/**
	 * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
	 *
	 */
	
	public String getVehicleIdentificationNumber() throws ClassCastException;
	
	public void setVehicleIdentificationNumber(String value) throws ClassCastException;
	/**
	 * The date of the first registration of the vehicle with the respective public authorities.
	 *
	 */
	
	public java.util.Date getDateVehicleFirstRegistered() throws ClassCastException;
	
	public void setDateVehicleFirstRegistered(java.util.Date value) throws ClassCastException;
	/**
	 * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.</p>
	 
	 <p>Typical unit code(s): C62 for persons.
	 *
	 */
	
	public <T> T getVehicleSeatingCapacity(Class<T> c) throws ClassCastException;
	
	public void setVehicleSeatingCapacity(Float value) throws ClassCastException;
	public void setVehicleSeatingCapacity(QuantitativeValue value) throws ClassCastException;
	/**
	 * The number of doors.</p>
	 
	 <p>Typical unit code(s): C62
	 *
	 */
	
	public <T> T getNumberOfDoors(Class<T> c) throws ClassCastException;
	
	public void setNumberOfDoors(QuantitativeValue value) throws ClassCastException;
	public void setNumberOfDoors(Float value) throws ClassCastException;
	/**
	 * The date the item e.g. vehicle was purchased by the current owner.
	 *
	 */
	
	public java.util.Date getPurchaseDate() throws ClassCastException;
	
	public void setPurchaseDate(java.util.Date value) throws ClassCastException;
	/**
	 * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
	 *
	 */
	
	public <T> T getFuelType(Class<T> c) throws ClassCastException;
	
	public void setFuelType(QualitativeValue value) throws ClassCastException;
	public void setFuelType(String value) throws ClassCastException;
	/**
	 * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
	 *
	 */
	
	public <T> T getDriveWheelConfiguration(Class<T> c) throws ClassCastException;
	
	public void setDriveWheelConfiguration(DriveWheelConfigurationValue value) throws ClassCastException;
	public void setDriveWheelConfiguration(String value) throws ClassCastException;
	/**
	 * The date of production of the item, e.g. vehicle.
	 *
	 */
	
	public java.util.Date getProductionDate() throws ClassCastException;
	
	public void setProductionDate(java.util.Date value) throws ClassCastException;
	/**
	 * The release date of a vehicle model (often used to differentiate versions of the same make and model).
	 *
	 */
	
	public java.util.Date getVehicleModelDate() throws ClassCastException;
	
	public void setVehicleModelDate(java.util.Date value) throws ClassCastException;
	/**
	 * The total number of forward gears available for the transmission system of the vehicle.</p>
	 
	 <p>Typical unit code(s): C62
	 *
	 */
	
	public <T> T getNumberOfForwardGears(Class<T> c) throws ClassCastException;
	
	public void setNumberOfForwardGears(Float value) throws ClassCastException;
	public void setNumberOfForwardGears(QuantitativeValue value) throws ClassCastException;
	/**
	 * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
	 *
	 */
	
	public String getVehicleInteriorType() throws ClassCastException;
	
	public void setVehicleInteriorType(String value) throws ClassCastException;
	/**
	 * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
	 *
	 */
	
	public String getVehicleSpecialUsage() throws ClassCastException;
	
	public void setVehicleSpecialUsage(String value) throws ClassCastException;
	/**
	 * A textual description of known damages, both repaired and unrepaired.
	 *
	 */
	
	public String getKnownVehicleDamages() throws ClassCastException;
	
	public void setKnownVehicleDamages(String value) throws ClassCastException;
	/**
	 * <p>The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).</p>
	 
	 <ul>
	 <li>Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use <a class="localLink" href="http://schema.org/unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.</li>
	 <li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="http://schema.org/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="http://schema.org/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
	 <li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> to link the value for the fuel economy to another value.</li>
	 </ul>
	 *
	 */
	
	public QuantitativeValue getFuelEfficiency() throws ClassCastException;
	
	public void setFuelEfficiency(QuantitativeValue value) throws ClassCastException;
	/**
	 * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.</p>
	 
	 <p>Typical unit code(s): LTR for liters, FTQ for cubic foot/feet</p>
	 
	 <p>Note: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.
	 *
	 */
	
	public QuantitativeValue getCargoVolume() throws ClassCastException;
	
	public void setCargoVolume(QuantitativeValue value) throws ClassCastException;
	/**
	 * The number or type of airbags in the vehicle.
	 *
	 */
	
	public <T> T getNumberOfAirbags(Class<T> c) throws ClassCastException;
	
	public void setNumberOfAirbags(String value) throws ClassCastException;
	public void setNumberOfAirbags(Float value) throws ClassCastException;
	/**
	 * Information about the engine or engines of the vehicle.
	 *
	 */
	
	public EngineSpecification getVehicleEngine() throws ClassCastException;
	
	public void setVehicleEngine(EngineSpecification value) throws ClassCastException;
	/**
	 * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.</p>
	 
	 <p>Typical unit code(s): KMT for kilometers, SMI for statute miles
	 *
	 */
	
	public QuantitativeValue getMileageFromOdometer() throws ClassCastException;
	
	public void setMileageFromOdometer(QuantitativeValue value) throws ClassCastException;
	/**
	 * The number of owners of the vehicle, including the current one.</p>
	 
	 <p>Typical unit code(s): C62
	 *
	 */
	
	public <T> T getNumberOfPreviousOwners(Class<T> c) throws ClassCastException;
	
	public void setNumberOfPreviousOwners(Float value) throws ClassCastException;
	public void setNumberOfPreviousOwners(QuantitativeValue value) throws ClassCastException;
	/**
	 * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
	 *
	 */
	
	public <T> T getVehicleTransmission(Class<T> c) throws ClassCastException;
	
	public void setVehicleTransmission(String value) throws ClassCastException;
	public void setVehicleTransmission(QualitativeValue value) throws ClassCastException;
	/**
	 * <p>The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).</p>
	 
	 <ul>
	 <li>Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use <a class="localLink" href="http://schema.org/unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.</li>
	 <li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="http://schema.org/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="http://schema.org/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
	 <li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> to link the value for the fuel consumption to another value.</li>
	 </ul>
	 *
	 */
	
	public QuantitativeValue getFuelConsumption() throws ClassCastException;
	
	public void setFuelConsumption(QuantitativeValue value) throws ClassCastException;
	/**
	 * The position of the steering wheel or similar device (mostly for cars).
	 *
	 */
	
	public SteeringPositionValue getSteeringPosition() throws ClassCastException;
	
	public void setSteeringPosition(SteeringPositionValue value) throws ClassCastException;
	/**
	 * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
	 *
	 */
	
	public String getVehicleConfiguration() throws ClassCastException;
	
	public void setVehicleConfiguration(String value) throws ClassCastException;
	/**
	 * The number of axles.</p>
	 
	 <p>Typical unit code(s): C62
	 *
	 */
	
	public <T> T getNumberOfAxles(Class<T> c) throws ClassCastException;
	
	public void setNumberOfAxles(Float value) throws ClassCastException;
	public void setNumberOfAxles(QuantitativeValue value) throws ClassCastException;
	/**
	 * The color or color combination of the interior of the vehicle.
	 *
	 */
	
	public String getVehicleInteriorColor() throws ClassCastException;
	
	public void setVehicleInteriorColor(String value) throws ClassCastException;
}
