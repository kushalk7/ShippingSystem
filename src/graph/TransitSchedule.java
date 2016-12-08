package graph;

import java.util.*;

import shipment.Shipment;
import values.Quantity.Quantity;
import values.Time.*;
import values.Money.*;

/**
 * 
 */
public class TransitSchedule {

    public TransitSchedule(Money cost, String srcStation, String dstStation, TransitMode mode) {
		super();
		this.freightRate = cost;
		this.srcStation = srcStation;
		this.dstStation = dstStation;
		this.mode = mode;
	}

    private int scheduleNumber;
    private String srcStation;
    private String dstStation;
    private TransitMode mode;
    private Frequency frequency;
    private Time[] DepartureTime,ArrivalTime;
	private Quantity freightCapacity,maxFreightCapacity;
    private Money freightRate;
		
    public Boolean bookSchedule(Shipment shipment) {
        // TODO implement here
        return null;
    }
    
	public int getScheduleNumber() {
		return scheduleNumber;
	}

	public void setScheduleNumber(int scheduleNumber) {
		this.scheduleNumber = scheduleNumber;
	}

	public Quantity getMaxcapacity() {
		return maxFreightCapacity;
	}

	public void setMaxcapacity(Quantity maxcapacity) {
		maxFreightCapacity = maxcapacity;
	}

	public Quantity getCapacity() {
			return freightCapacity;
	}

	public void setCapacity(Quantity d) {
		this.freightCapacity = d;
	}

	public Money getfreightRate() {
		return freightRate;
	}

	public void setfreightRate(Money cost) {
		this.freightRate = cost;
	}

	public String getSrcStation() {
		return srcStation;
	}

	public void setSrcStation(String srcStation) {
		this.srcStation = srcStation;
	}

	public String getDstStation() {
		return dstStation;
	}

	public void setDstStation(String dstStation) {
		this.dstStation = dstStation;
	}

	public TransitMode getMode() {
		return mode;
	}

	public void setMode(TransitMode mode) {
		this.mode = mode;
	}

	public Frequency getFreq() {
		return frequency;
	}

	public void setFreq(Frequency freq) {
		this.frequency = freq;
	}

	public Time[] getDepartureTime() {
		return DepartureTime;
	}

	public void setDepartureTime(Time[] departureTime) {
		DepartureTime = departureTime;
	}

	public Time[] getArrivalTime() {
		return ArrivalTime;
	}

	public void setArrivalTime(Time[] arrivalTime) {
		ArrivalTime = arrivalTime;
	}

}