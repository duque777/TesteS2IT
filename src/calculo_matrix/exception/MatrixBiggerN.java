/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_matrix.exception;

/**
 *
 * @author duque
 */
public class MatrixBiggerN extends IllegalArgumentException{
    
    public MatrixBiggerN() {
        super("A quantidade de colunas e linhas da matriz deve ser o valor informado de N.");
    }
    
}
