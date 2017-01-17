/**
 * 
 */
package factory_chart;



/**
 * @author marcel
 * Hier werden die Objekte erzeugt
 */
public class Kuchendiagramproduktion implements ChartProduction {

	/** 
	 * Erzeugt eine Legende
	 * @return Kuchenlegendeobject  
	 * 
	 * */
	public Legende createLegende(){
        return new Kuchenlegende();
    }
	
	/** 
	 * Erzeugt ein Diagramm
	 * @return Kuchendiagramobjekt  
	 * 
	 * */
	public Chart createChart(){
		return new Kuchenchart();
    }
}
