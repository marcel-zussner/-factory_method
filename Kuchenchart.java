/**
 * 
 */
package factory_chart;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;

/**
 * @author marcel
 * Diese Klasse erzeugt das Kuchendiagram 
 */
public class Kuchenchart implements Chart {

		public Kuchenchart(){
			DefaultPieDataset pieDataset = new DefaultPieDataset();
			pieDataset.setValue("JavaWorld", 75);
			pieDataset.setValue("Other", 25);
			JFreeChart chart = ChartFactory.createPieChart
					("Sample Pie Chart", // Title
					pieDataset, // Dataset
					true,// legend
					false,// tooltips
					false// URL
					);
			
			ChartFrame frame = new ChartFrame("Example", chart);
			frame.pack();
			RefineryUtilities.centerFrameOnScreen(frame);
			frame.setVisible(true);
		}

}
