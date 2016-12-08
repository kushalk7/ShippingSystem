package serviceClass;

import java.util.*;

import graph.TransitMode;
import shipment.EventType;
import values.Money.*;


public class ShippingService {

   
    public ShippingService() {
    }

   
    public Money estimateShippingCost(String Source, String Destination) {

        return null;
    }

  
    public void executeShippingOrder(String source, String destination, TransitMode mode) {
        // TODO implement here
    }

   
    public void findNearestStation(String Destination) {
        // TODO implement here
    }

    
    public void getTrackingSummary(String shippingID) {
        // TODO implement here
    }

   
    public void recordHandlingEvent(EventType event) {
        // TODO implement here
    }

  
    public void printShippingLabel(String ShippingID) {
        // TODO implement here
    }

  
    public void initiatePackageReturn(String ShippingID) {
        // TODO implement here
    }

  
    public void buyInsurance(String ShippingID) {
        // TODO implement here
    }

   
    public void claimInsurance(String ShippingID) {
        // TODO implement here
    }

}