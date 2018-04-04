/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_matriz.application.impl.test;

import calculo_matriz.application.impl.Matrix;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duque
 */
public class MatrixTest {

    /**
     * Test coma a soma da diagonal principal de uma matriz.
     */
    @Test
    public void testSomaDiagonalPrincipal() {
        int[][] mtrx = {{1, 5, 3, 2}, {4, 8, -5, 6}, {7, 3, 4, 5}, {2, 5, 9, -9}};
        int n = 4;
        Matrix matrix = new Matrix();
        int expResult = 4;
        int result = matrix.somaDiagonalPrincipal(mtrx, n);
        assertEquals(expResult, result);
    }

    /**
     * Test com a soma da diagonal secundaria de uma matriz.
     */
    @Test
    public void testSomaDiagonalSecundaria() {
        int[][] mtrx = {{1, 5, 3, 2}, {4, 8, -5, 6}, {7, 3, 4, 5}, {2, 5, 9, -9}};
        int n = 4;
        Matrix matrix = new Matrix();
        int expResult = 2;
        int result = matrix.somaDiagonalSecundaria(mtrx, n);
        assertEquals(expResult, result);
    }

    /**
     * Test com a diferenca das diagonais de maneira correta.
     */
    @Test
    public void testDiffDiagonal() {
        int[][] mtrx = {{1, 5, 3, 2}, {4, 8, -5, 6}, {7, 3, 4, 5}, {2, 5, 9, -9}};
        int n = 4;
        Matrix matrix = new Matrix();
        int expResult = 2;
        int result = matrix.diffDiagonal(mtrx, n);
        assertEquals(expResult, result);
    }


}
