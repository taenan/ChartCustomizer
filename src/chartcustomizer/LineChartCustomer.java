/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcustomizer;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

/**
 *
 * @author tecnodocs
 */
public class LineChartCustomer extends JRAbstractChartCustomizer {

    @Override
    public void customize(JFreeChart chart, JRChart jasperChart) {
        CategoryPlot categoryPlot;
        LineAndShapeRenderer lineAndShapeRenderer;

        categoryPlot = (CategoryPlot) chart.getPlot();
        lineAndShapeRenderer = (LineAndShapeRenderer) categoryPlot.getRenderer();
        lineAndShapeRenderer.setBaseItemLabelsVisible(Boolean.TRUE);
        lineAndShapeRenderer.setBaseItemLabelGenerator((CategoryItemLabelGenerator) new StandardCategoryItemLabelGenerator());

        NumberAxis rangeAxis = (NumberAxis) categoryPlot.getRangeAxis();
        rangeAxis.setRange(0, 100);
        
//        ValueAxis valueAxis = (ValueAxis) categoryPlot.getRangeAxis();
        
//        valueAxis.setLabel("value");
    }

}
