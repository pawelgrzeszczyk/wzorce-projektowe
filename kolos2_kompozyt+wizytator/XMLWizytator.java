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
public class XMLWizytator implements Wizytator{

   
    @Override
    public String visit_start(Szkola s) {
        return "<"+s.get_nazwa()+">";
    }

    @Override
    public String visit(Klasa k) {
        return "\t"+"<"+k.getNazwa()+">"+"</"+k.getNazwa()+">";
    }

    @Override
    public String visit_stop(Szkola s) {
        return "</"+s.get_nazwa()+">";
    }

   
    
}
