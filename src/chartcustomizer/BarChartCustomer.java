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
import org.jfree.chart.renderer.category.CategoryItemRenderer;

/**
 *
 * @author tecnodocs
 */
public class BarChartCustomer extends JRAbstractChartCustomizer {
    
    @Override
    public void customize(JFreeChart chart, JRChart jasperChart) {
        
        CategoryPlot categoryPlot;
        categoryPlot = (CategoryPlot) chart.getPlot();
        CategoryItemRenderer renderer = new BarCustomRenderer(categoryPlot);
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
        renderer.setBaseItemLabelGenerator((CategoryItemLabelGenerator) new StandardCategoryItemLabelGenerator());
        categoryPlot.setRenderer(renderer);
        
        int maxRange = 110;
        
        NumberAxis rangeAxis = (NumberAxis)categoryPlot.getRangeAxis();
        rangeAxis.setRange(0, maxRange);
        
    }

}