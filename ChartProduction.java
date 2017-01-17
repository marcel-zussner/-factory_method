/**
 * 
 */
package factory_chart;

/**
 * @author marcel
 * Interface für die Diagramme & Legende
 */
public interface ChartProduction {

	public Legende createLegende();
    public Chart createChart();
}
