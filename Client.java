/**
 * 
 */
package factory_chart;




/**
 * @author marcel
 * Beispielclient
 * Er benutz die Interfaces um eine Legende und ein Diagramm 
 * zu erstellen
 */
public class Client {

	/**
	 * @param args Unused. 
	 * @return Nothing
	 * 
	 */
	public static void main(String[] args) {
		// Balkendiagram
		/*
		//An einer zentrale Stelle wird der Typ bestimmt -> schneller Austausch
	    ChartProduction production = new Balkendiagramproduktion();

	    //Objekte werden erstellt 
	    Legende legende = production.createLegende();
	    Chart chart = production.createChart();

	    System.out.println(legende);
		System.out.println(chart);
		
		*/
		//Kuchendiagram
		//An einer zentrale Stelle wird der Typ bestimmt -> schneller Austausch
	    ChartProduction production = new Kuchendiagramproduktion();

	    //Objekte werden erstellt 
	    Legende legende = production.createLegende();
	    Chart chart = production.createChart();

	    System.out.println(legende);
		System.out.println(chart);
		

		
	}

}
