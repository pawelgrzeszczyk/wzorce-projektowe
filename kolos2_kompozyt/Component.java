/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_kompozyt;

/**
 *
 * @author Pawel
 */
public interface Component {
    void dodaj(Component component);
    void usun(Component component);
    void zmien(String nazwa);
    void wyswietl();
}
