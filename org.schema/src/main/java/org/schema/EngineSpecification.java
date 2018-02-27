package org.schema;
/**
* Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
*/
public class EngineSpecification extends StructuredValue{
	
	
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
}
