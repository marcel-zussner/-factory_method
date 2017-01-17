/**
 * 
 */
package factory_chart;

import org.jfree.ui.RefineryUtilities;

/**
 * @author marcel
 * Hier werden die Objekte erzeugt
 */
public class Balkendiagramproduktion implements ChartProduction {

	/** 
	 * Erzeugt eine Legende
	 * @return Balkenlegendeobject  
	 * 
	 * */
	public Legende createLegende(){
		return new Balkenlegende();
    }
	
	/** 
	 * Erzeugt ein Balkendiagram
	 * @return Balkenlegendeobject  
	 * 
	 * */
	public Chart createChart(){
		Balkenchart demo = new Balkenchart("Bar Demo 1");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);

		return demo;
    }
}
