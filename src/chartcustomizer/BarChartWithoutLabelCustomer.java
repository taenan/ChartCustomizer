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
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author tecnodocs
 */
public class BarChartWithoutLabelCustomer extends JRAbstractChartCustomizer {
    
    @Override
    public void customize(JFreeChart chart, JRChart jasperChart) {
        
        CategoryPlot categoryPlot;
        categoryPlot = (CategoryPlot) chart.getPlot();
        BarCustomRenderer renderer = new BarCustomRenderer(categoryPlot);
        renderer.setShadowVisible(false); 
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE3, TextAnchor.CENTER_RIGHT));
//        CategoryItemRenderer renderer = ;
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
        renderer.setBaseItemLabelGenerator((CategoryItemLabelGenerator) new StandardCategoryItemLabelGenerator());
        categoryPlot.setRenderer(renderer);
        
        NumberAxis rangeAxis = (NumberAxis)categoryPlot.getRangeAxis();
        rangeAxis.setRange(0, 100);
        
    }

}