/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Marcin
 */
public interface Automat {
    void setNext(Automat next);
    DokumentOplaty execute(Banknot banknot);
}
