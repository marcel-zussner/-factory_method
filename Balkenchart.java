/**
 * 
 */
package factory_chart;

import org.jfree.chart.*;
import java.awt.Dimension;
import org.jfree.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;



/**
 * @author marcel
 * Diese Klasse erzeugt das Balkendiagram 
 *
 */
public class Balkenchart extends ApplicationFrame implements Chart  {

	public Balkenchart(String title) {
		super(title);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(1.0, "Row 1", "Column 1");
		dataset.addValue(5.0, "Row 1", "Column 2");
		dataset.addValue(3.0, "Row 1", "Column 3");
		dataset.addValue(2.0, "Row 2", "Column 1");
		dataset.addValue(3.0, "Row 2", "Column 2");
		dataset.addValue(2.0, "Row 2", "Column 3");
		JFreeChart chart = ChartFactory.createBarChart(
		"Bar Chart Demo", // chart title
		"Category", // domain axis label
		"Value", // range axis label
		dataset, // data
		PlotOrientation.VERTICAL, // orientation
		true, // include legend
		true, // tooltips
		false // URLs
		);
		ChartPanel chartPanel = new ChartPanel(chart, false);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(chartPanel);
		}
	
	


}
