/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_matriz.application;

/**
 *
 * @author duque
 */
public interface MatrixCheckRule {
    
    public boolean checkMatrixFormat(int coluna, int linha);
    public boolean checkMatrixBiggerN(int tamanho, int n);
    public boolean checkElementRange(int element);
    
}
