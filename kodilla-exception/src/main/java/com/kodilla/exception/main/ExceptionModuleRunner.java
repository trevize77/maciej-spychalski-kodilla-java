package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearcher;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        boolean isFlightPossible = false;
        try {
            isFlightPossible = flightSearcher.findFilght(new Flight("Hurghada International Airport",
                    "Radom Airport"));
        } catch (RouteNotFoundException rnfe) {
            System.out.println(rnfe);
        }
        System.out.format("Flight %s available.\n", ((isFlightPossible) ? "is" : "isn't"));
    }
}
