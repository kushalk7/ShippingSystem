package graph;

import java.util.*;

import itinerary.Itinerary;

/**
 * 
 */
public class TransitStationRepository {

    /**
     * Default constructor
     */
    public TransitStationRepository() {
    	transitStations  = new HashMap<String, TransitStation>();
    	initTransitStations();
    }

    /**
     * 
     */
    private Map<String,TransitStation> transitStations;

    /**
     * @param station
     */
    public void AddTransitStation(TransitStation station) {
        transitStations.put(station.getStationCode(), station);
    }

    /**
     * @param station
     */
    public void DeleteTransitStation(TransitStation station) {
        transitStations.remove(station.getStationCode());
    }
    
    public TransitStation getTransitStation(String stationCode){
    	if(transitStations.containsKey(stationCode)){
    		return transitStations.get(stationCode);
    	}
    	return null;
    }

    /**
     * @param srcStation 
     * @param dstStation 
     * @param mode 
     * @return
     */
    public Itinerary createItinerary(String srcStation, String dstStation, TransitMode mode) {
        // TODO implement here
        return null;
    }
    
    private void initTransitStations(){
    	List<String> stationList = new LinkedList<>();
    	stationList.add("San Jose, SJ");
    	stationList.add("San Francisco, SF");
    	stationList.add("New York,NY");
    	stationList.add("Memphis, MPH");
    	stationList.add("Indianapolis, INDP");
    	stationList.add("Oakland, OKL");
    	stationList.add("Newark, NWK");
    	stationList.add("Houston, HT");
    	for(String s : stationList){
    		String[] split = s.split(",");
    		TransitStation station = new TransitStation(split[0],split[1]);
    		this.transitStations.put(split[1], station);
    	}   	
    	
    }

}