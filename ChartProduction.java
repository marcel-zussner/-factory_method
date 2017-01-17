/**
 * 
 */
package factory_chart;

/**
 * @author marcel
 * Interface f�r die Diagramme & Legende
 */
public interface ChartProduction {

	public Legende createLegende();
    public Chart createChart();
}
