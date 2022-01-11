/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcustomizer;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;
import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.ui.RectangleEdge;

/**
 *
 * @author tecnodocs
 */
public class PieChartCustomer2 extends JRAbstractChartCustomizer {

    @Override
    public void customize(JFreeChart chart, JRChart jasperChart) {
        LegendTitle legend = chart.getLegend();
        legend.setPosition(RectangleEdge.LEFT);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSimpleLabels(false);

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                "{0}: {2}", new DecimalFormat("0"), new DecimalFormat("0.0%"));

        Font font = new Font("sansserif", Font.PLAIN, 8);
        List<Comparable> keys = plot.getDataset().getKeys();

        if (keys.size() > 0) {
            plot.setSectionPaint(keys.get(0), Color.decode("#" + ColorsUtils.RED));
            if (keys.size() > 1) {
                plot.setSectionPaint(keys.get(1), Color.decode("#" + ColorsUtils.YELLOW));
                if (keys.size() > 2) {
                    plot.setSectionPaint(keys.get(2), Color.decode("#" + ColorsUtils.GREEN));
                    if (keys.size() > 3) {
                        plot.setSectionPaint(keys.get(3), Color.decode("#" + ColorsUtils.BLUE));
                        if (keys.size() > 4) {
                            plot.setSectionPaint(keys.get(4), Color.decode("#" + ColorsUtils.DEEP_PURPLE));
                        }
                    }
                }
            }
        }

        plot.setLabelFont(font);
        plot.setShadowPaint(null);
        plot.setLabelGenerator(gen);
    }

}
