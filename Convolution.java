/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgisleme;

import cezeri.matrix.CMatrix;
import java.awt.Color;

/**
 *
 * @author YUSUFNAS
 */
public class Convolution {

    public static void main(String[] args) {

        double[][] matrix = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 1, -1, -1, -1, -1, -1, 1, -1},
            {-1, -1, 1, -1, -1, -1, 1, -1, -1},
            {-1, -1, -1, 1, -1, 1, -1, -1, -1},
            {-1, -1, -1, -1, 1, -1, -1, -1, -1},
            {-1, -1, -1, -1, 1, -1, -1, -1, -1},
            {-1, -1, -1, -1, 1, -1, -1, -1, -1},
            {-1, -1, -1, -1, 1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
        double[][] d1 = {
            {1, -1, -1},
            {-1, 1, -1},
            {-1, -1, 1}
        };
        double[][] d2 = {
            {-1, -1, 1},
            {-1, 1, -1},
            {1, -1, -1}
        };

        //a
        CMatrix c1 = CMatrix.getInstance(d1).heatmap(Color.cyan, 200, 200, true, true);
        CMatrix cm2 = CMatrix.getInstance(matrix);
        CMatrix cm_d1 = cm2.convolve(c1)
                .heatmap(Color.cyan, 400, 400, true, true);

        //b
        CMatrix c2 = CMatrix.getInstance(d2).heatmap(Color.cyan, 200, 200, true, true);;
        CMatrix cm = CMatrix.getInstance(matrix);
        CMatrix cm_d2 = cm.convolve(c2)
                .heatmap(Color.cyan, 400, 400, true, true);

        //Sekil
        CMatrix YSekil = CMatrix.getInstance(matrix).heatmap(Color.BLACK, 200, 200);

    }

}
