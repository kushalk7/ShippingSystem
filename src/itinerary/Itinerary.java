package itinerary;

import java.util.*;
import Address.*;
import graph.TransitSchedule;
import Money.*;
/**
 * 
 */
public interface Itinerary {

    /**
     * 
     */
    private Set<TransitSchedule> schedule;

    /**
     * 
     */
    private Money cost;

    /**
     * @param SrcAddr 
     * @param DestAddr 
     * @return
     */
    public Itinerary GenerateItinerary(Address SrcAddr, Address DestAddr);

}