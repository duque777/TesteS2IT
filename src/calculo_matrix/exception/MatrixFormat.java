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
public class MatrixFormat extends IllegalArgumentException{
    
    public MatrixFormat() {
        super("A matriz deve ser do formato NxN.");
    }
    
}
