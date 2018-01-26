/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

/**
 *
 * @author Pawel
 */
public interface Wizytator {
    int visit(KatalogKompozyt katalog);
    int visit(PlikLisc plik);
    
}
