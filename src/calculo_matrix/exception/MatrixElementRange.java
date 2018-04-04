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
public class MatrixElementRange extends IllegalArgumentException{
    
    public MatrixElementRange() {
        super("O Elemento deve ser um valor inteiro de -100 a 100.");
    }
    
}
