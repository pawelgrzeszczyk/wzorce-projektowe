/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozytwizytator;

/**
 *
 * @author Matje
 */
public interface Wizytator {
    String visit_start(Szkola s);
    String visit_stop(Szkola s);
    String visit(Klasa k);
}
