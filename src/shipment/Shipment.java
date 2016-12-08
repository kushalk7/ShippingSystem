package shipment;

import java.util.*;
import graph.*;
import graph.TransitStation.link;
import shippingManifest.CommerialInvoice;


public class Shipment {
	
	private String shipmentID;
	private CommerialInvoice manifest;
	private Set<HandlingEvent> history;
	private ShipmentStatus status;

    public Shipment(String shipmentID, CommerialInvoice manifest, Set<HandlingEvent> event, ShipmentStatus status) {
		super();
		this.shipmentID = shipmentID;
		this.manifest = manifest;
		this.history = event;
		this.status = status;
	}
    
    

    public String getShipmentID() {
		return shipmentID;
	}



	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}



	public CommerialInvoice getManifest() {
		return manifest;
	}



	public void setManifest(CommerialInvoice manifest) {
		this.manifest = manifest;
	}



	public Set<HandlingEvent> getHistory() {
		return history;
	}



	public void setHistory(Set<HandlingEvent> history) {
		this.history = history;
	}



	public ShipmentStatus getStatus() {
		return status;
	}



	public void setStatus(ShipmentStatus status) {
		this.status = status;
	}



	public boolean BookTransit(TransitSchedule schedule) {
    	
    	Double CurrentCapacity = schedule.getCapacity();
    	
       if(CurrentCapacity < schedule.getMaxcapacity())
       {
    	   schedule.setCapacity(schedule.getCapacity() + 1);
    	   return true;
       }
       else
    	   return false;
    }



	@Override
	public String toString() {
		return "Shipment [shipmentID=" + shipmentID + ", manifest=" + manifest + ", history=" + history + ", status="
				+ status + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((history == null) ? 0 : history.hashCode());
		result = prime * result + ((manifest == null) ? 0 : manifest.hashCode());
		result = prime * result + ((shipmentID == null) ? 0 : shipmentID.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shipment other = (Shipment) obj;
		if (history == null) {
			if (other.history != null)
				return false;
		} else if (!history.equals(other.history))
			return false;
		if (manifest == null) {
			if (other.manifest != null)
				return false;
		} else if (!manifest.equals(other.manifest))
			return false;
		if (shipmentID == null) {
			if (other.shipmentID != null)
				return false;
		} else if (!shipmentID.equals(other.shipmentID))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	
}