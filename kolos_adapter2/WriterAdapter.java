/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_adapter2;

/**
 *
 * @author Pawel
 */
public class WriterAdapter implements Writer{

    @Override
    public void save(String data) {
        NewWriter adapter = new NewWriter();
        adapter.save(data, "czerwony");
    }
    
}
