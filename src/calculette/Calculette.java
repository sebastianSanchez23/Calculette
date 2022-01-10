/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculette;

/**
 *
 * @author pollo
 */
public class Calculette {

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public int rest(int n1, int n2) {
        return n1 - n2;
    }

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public double div(int n1, int n2) {
        return n2 == 0 ? 0 : n1 / n2;
    }

}
