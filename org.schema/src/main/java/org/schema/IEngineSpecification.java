package org.schema;
/**
* Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
*/
public interface IEngineSpecification extends IStructuredValue{
	
	
	/**
	 * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
	 *
	 */
	
	public <T> T getFuelType(Class<T> c) throws ClassCastException;
	
	public void setFuelType(QualitativeValue value) throws ClassCastException;
	public void setFuelType(String value) throws ClassCastException;
}
