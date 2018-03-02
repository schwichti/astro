package de.upb.dbis.astro.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.schema.Airline;
import org.schema.Airport;
import org.schema.Flight;
import org.schema.Vehicle;

import com.jayway.jsonpath.JsonPath;

import io.swagger.client.ApiException;
import io.swagger.client.api.OperationsApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

public class Adapter {

	private OperationsApi openapi;
	
	public Adapter() {
	    
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: auth
        OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
        auth.setAccessToken("YOUR ACCESS TOKEN");//FIXME Set access token

        openapi = new OperationsApi();
	}
	
	public Flight operationsSchedulesFromDateTimeByOriginAndDestinationGet(
			Airport owls_origin, 
			Airport owls_destination, 
			java.util.Date owls_fromDataTime) throws ApiException{
		
		Flight result;
		String response;
		
		
		String openapi_origin = owls_origin.getIataCode();
		String openapi_destination = owls_destination.getIataCode();
		String openapi_fromDataTime = new SimpleDateFormat("yyyy-MM-dd").format(owls_fromDataTime);
		String openapi_accept = "application/json";
        Boolean openapi_directFlights = false;
        String openapi_limit = "10";
        String openapi_offset = "0";
		
		response = openapi.operationsSchedulesFromDateTimeByOriginAndDestinationGet(openapi_origin, openapi_destination, openapi_fromDataTime, openapi_accept, openapi_directFlights, openapi_limit, openapi_offset);
		
		result = new Flight();
		
		String estimatedFlightDuration = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].TotalJourney.Duration", String.class);
		result.setEstimatedFlightDuration(estimatedFlightDuration);
		
		Airport airport = new Airport();
		String iataCode = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Departure.AirportCode", String.class);
		airport.setIataCode(iataCode);
		
		String departureTime_ = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Departure.ScheduledTimeLocal.DateTime", String.class);
		Date depatureTime;
		try {
			depatureTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(departureTime_);
			result.setDepartureTime(depatureTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Airport airport2 = new Airport();
		String iataCode2 = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Arrival.AirportCode", String.class);
		airport2.setIataCode(iataCode2);
		
		String arrivalTime_ = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Arrival.ScheduledTimeLocal.DateTime", String.class);
		Date arrivalTime;
		try {
			arrivalTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(arrivalTime_);
			result.setArrivalTime(arrivalTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String arrivalTerminal = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Arrival.Terminal.Name", String.class);
		result.setArrivalTerminal(arrivalTerminal);
		
		String flightNumber = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.MarketingCarrier.FlightNumber", String.class);
		result.setFlightNumber(flightNumber);
		
		Airline airline = new Airline();
		String iataCode3 = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.OperatingCarrier.AirlineID", String.class);
		airline.setIataCode(iataCode3);
		
		Vehicle vehicle = new Vehicle();
		String identifier = JsonPath.parse(response).read("$.ScheduleResource.Schedule.[0].Flight.Equipment.AircraftCode", String.class);
		vehicle.setIdentifier(identifier);
		
		return result;
			
		
	}
}
