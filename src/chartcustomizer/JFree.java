package chartcustomizer;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;

public class JFree extends JRAbstractChartCustomizer {

    @Override
    public void customize(JFreeChart chart, JRChart jasperChart) {
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setRenderer(new BarCustomRenderer(categoryPlot));
    }
}
