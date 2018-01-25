/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanuchmediator;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author Matje
 */
public class Mediator_firma implements Mediator {

    //List<Firma_inf> lista_wykonywania_zlecen = new VirtualFlow.ArrayLinkedList<>();

    public Mediator_firma() {
       
    }

    @Override
    public void wyslij_dokumentacje(Firma_inf f, String dok) {
        f.odbierz(dok);
    }

   

}
