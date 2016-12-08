package graph;

import java.util.*;
import values.Time.*;
import values.address.Address;

/**
 * 
 */
public class TransitStation {

	private String name;
    private String stationCode;
    private Address address;

	
    public TransitStation(String name, String stationCode, Address address) {
		super();
		this.name = name;
		this.stationCode = stationCode;
		this.address = address;
	}
    
    public TransitStation(String name, String stationCode) {
		super();
		this.name = name;
		this.stationCode = stationCode;
		this.address = null;
	}

    /**
     * 
     */
    public Set<Link> links;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
    public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addTransitSchedule(TransitSchedule schedule){
		if(links == null){
			links = new HashSet<Link>();
		}
		Link l = getLink(schedule.getDstStation());
		if(l != null){
			l.addSchedule(schedule);
		}else{
			l = new Link(schedule.getDstStation());
			l.addSchedule(schedule);
			links.add(l);
		}
	}

	/**
     * @param link
     */
    public void deleteTransitSchedule(TransitSchedule schedule) {
        Link l = getLink(schedule.getDstStation());
        //Delete schedule 
        l.removeTransitSchedule(schedule.getScheduleNumber());
    }

    /**
     * @param link
     */
    public void editTransitSchedule(TransitSchedule schedule) {
    	Link l = getLink(schedule.getDstStation());
    	if(l != null){
    		TransitSchedule sch = l.getTransitSchedule(schedule.getScheduleNumber());
    		//Edit Schedule
    		sch = schedule;
    	}
    }
    
    private Link getLink(String station){
    	if(links != null){
    		for(Link l:links){
    			if(l.getNextStation().equalsIgnoreCase(station)){    				
    				return l;
    			}
    		}
    	}
    	return null;
    }

	/**
     * Edge in graph
     */
    private class Link {

    	private String nextStation;
//    	private schedule
        public Link(String nextStation) {
        	this.nextStation = nextStation;
        	schedules = new HashSet<>();
        }
        private Set<TransitSchedule> schedules;

        public void addSchedule(TransitSchedule sch){
        	sch.setScheduleNumber(schedules.size()+1);
        	schedules.add(sch);
        }
        
        public TransitSchedule getTransitSchedule(int schNum){
        	for (TransitSchedule s : schedules){
        		if(s.getScheduleNumber() == schNum){
        			return s;
        		}
        	}
        	return null;
        }
        
        public void removeTransitSchedule(int schNum){
        	for (TransitSchedule s : schedules){
        		if(s.getScheduleNumber() == schNum){
        			schedules.remove(s);
        		}
        	}
        }

		public String getNextStation() {
			return nextStation;
		}

		public void setNextStation(String nextStation) {
			this.nextStation = nextStation;
		}

		public Set<TransitSchedule> getSchedules() {
			return schedules;
		}



		public void setSchedules(Set<TransitSchedule> schedules) {
			this.schedules = schedules;
		}
        

    }

}