/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_proxy2;

import java.util.List;

/**
 *
 * @author Pawel
 */
public interface FileAbstract {
    List getListaPlikow();
    void add(File file);
    void print();
}
