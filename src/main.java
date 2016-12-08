import graph.TransitMode;
import graph.TransitSchedule;
import graph.TransitStation;
import graph.TransitStationRepository;
import values.Money.Currency;
import values.Money.CurrencyConverter;
import values.Money.Money;

public class main {

	public static void main(String[] args) {
		TransitStationRepository repo = new TransitStationRepository();
		
		TransitStation sj= repo.getTransitStation("SJ");
		TransitSchedule sjToSf= new TransitSchedule(new Money(Currency.USD,5,0), "SJ", "SF", TransitMode.GROUND);
		sj.addTransitSchedule(sjToSf);
		
		TransitSchedule sfToNY = new TransitSchedule(new Money(Currency.USD, 7, 50), "SF", "NY", TransitMode.GROUND);
		repo.getTransitStation("SF").addTransitSchedule(sfToNY);
		
		TransitSchedule HTToNY = new TransitSchedule(new Money(Currency.USD, 4, 50), "HT", "NY", TransitMode.GROUND);
		repo.getTransitStation("HT").addTransitSchedule(HTToNY);
		
		
	}

}
