/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_matriz.application.impl;

import calculo_matrix.exception.MatrixBiggerN;
import calculo_matrix.exception.MatrixElementRange;
import calculo_matrix.exception.MatrixFormat;
import calculo_matriz.application.MatrixApplication;
import calculo_matriz.application.MatrixCheckRule;

/**
 *
 * @author duque
 */
public class Matrix implements MatrixApplication, MatrixCheckRule {

    @Override
    public int somaDiagonalPrincipal(int[][] mtrx, int n) {
        int soma = 0;
        try {
            if (checkMatrixFormat(mtrx.length, mtrx[0].length)) {
                throw new MatrixFormat();
            }
            if (checkMatrixBiggerN(mtrx.length, n)) {
                throw new MatrixBiggerN();
            }

            for (int i = 0; i < n; i++) {
                if (checkElementRange(mtrx[i][i])) {
                    throw new MatrixElementRange();
                }
                soma += mtrx[i][i];
            }
        } catch (IllegalArgumentException me) {
            System.err.println(me.getMessage());
        }
        return soma;
    }

    @Override
    public int somaDiagonalSecundaria(int[][] mtrx, int n) {
        int soma = 0;
        try {
            if (checkMatrixFormat(mtrx.length, mtrx[0].length)) {
                throw new MatrixFormat();
            }
            if (checkMatrixBiggerN(mtrx.length, n)) {
                throw new MatrixBiggerN();
            }

            int j = n - 1;
            for (int i = 0; i < n; i++) {
                if (checkElementRange(mtrx[i][j - i])) {
                    throw new MatrixElementRange();
                }
                soma += mtrx[i][j - i];
            }
        } catch (IllegalArgumentException me) {
            System.err.println(me.getMessage());
        }
        return soma;
    }

    @Override
    public int diffDiagonal(int[][] mtrx, int n) {
        return somaDiagonalPrincipal(mtrx, n) - somaDiagonalSecundaria(mtrx, n);
    }

    @Override
    public boolean checkMatrixFormat(int coluna, int linha) {
        return (coluna != linha);
    }

    @Override
    public boolean checkMatrixBiggerN(int tamanho, int n) {
        return (tamanho != n);
    }

    @Override
    public boolean checkElementRange(int element) {
        return (element < -100 || element > 100);
    }

}
