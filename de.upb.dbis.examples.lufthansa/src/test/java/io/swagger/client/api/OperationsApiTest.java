/*
 * LH Public API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperationsApi
 */
@Ignore
public class OperationsApiTest {

    private final OperationsApi api = new OperationsApi();

    
    /**
     * Flight Status at Arrival Airport
     *
     * Status of all arrivals at a given airport up to 4 hours from the provided date time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationsFlightstatusArrivalsByAirportCodeAndFromDateTimeGetTest() throws ApiException {
        String airportCode = null;
        String fromDateTime = null;
        String accept = null;
        String limit = null;
        String offset = null;
        String response = api.operationsFlightstatusArrivalsByAirportCodeAndFromDateTimeGet(airportCode, fromDateTime, accept, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Flight Status
     *
     * Status of a particular flight (boarding, delayed, etc.).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationsFlightstatusByFlightNumberAndDateGetTest() throws ApiException {
        String flightNumber = null;
        String date = null;
        String accept = null;
        String limit = null;
        String offset = null;
        String response = api.operationsFlightstatusByFlightNumberAndDateGet(flightNumber, date, accept, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Flight Status at Departure Airport
     *
     * Status of all departures from a given airport up to 4 hours from the provided date time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationsFlightstatusDeparturesByAirportCodeAndFromDateTimeGetTest() throws ApiException {
        String airportCode = null;
        String fromDateTime = null;
        String accept = null;
        String limit = null;
        String offset = null;
        String response = api.operationsFlightstatusDeparturesByAirportCodeAndFromDateTimeGet(airportCode, fromDateTime, accept, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Flight Status by Route
     *
     * Status of flights between a given origin and destination on a given date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationsFlightstatusRouteDateByOriginAndDestinationGetTest() throws ApiException {
        String origin = null;
        String destination = null;
        String date = null;
        String accept = null;
        String limit = null;
        String offset = null;
        String response = api.operationsFlightstatusRouteDateByOriginAndDestinationGet(origin, destination, date, accept, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Flight Schedules
     *
     * Scheduled flights between given airports on a given date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationsSchedulesFromDateTimeByOriginAndDestinationGetTest() throws ApiException {
        String origin = null;
        String destination = null;
        String fromDateTime = null;
        String accept = null;
        Boolean directFlights = null;
        String limit = null;
        String offset = null;
        String response = api.operationsSchedulesFromDateTimeByOriginAndDestinationGet(origin, destination, fromDateTime, accept, directFlights, limit, offset);

        // TODO: test validations
    }
    
}
