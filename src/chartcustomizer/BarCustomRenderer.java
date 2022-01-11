/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcustomizer;

import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

/**
 *
 * @author tecnodocs
 */
public class BarCustomRenderer extends BarRenderer {
//usar o BarChartCustomer no IReport
    private final CategoryPlot categoryPlot;

    public BarCustomRenderer(CategoryPlot categoryPlot) {
        this.categoryPlot = categoryPlot;
    }

    @Override
    public Paint getItemPaint(final int row, final int column) {
        Number value = categoryPlot.getDataset().getValue(row, column);
        double fimVermelho = 39.99D;
        double fimAmarelo = 69.99D;
        double fimVerde = 84.99D;

        if (value.doubleValue() > fimVermelho) {
            if (value.doubleValue() > fimAmarelo) {
                if (value.doubleValue() > fimVerde) {
                    return Color.decode("#" + ColorsUtils.BLUE);
                } else {
                    return Color.decode("#" + ColorsUtils.GREEN);
                }
            } else {
                return Color.decode("#" + ColorsUtils.YELLOW);
            }
        } else {
            return Color.decode("#" + ColorsUtils.RED);
        }
    }
}

//Color.decode("#00008B")
