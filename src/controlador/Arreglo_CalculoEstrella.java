/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.CalculoEstrella;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;

/**
 *
 * @author Saul
 */
public class Arreglo_CalculoEstrella {
      private List<CalculoEstrella> list = new ArrayList();
      
      public Arreglo_CalculoEstrella() {
        list.add(new CalculoEstrella("Enrique","Chamaya", 75, 1));
        
        

    }
      
  
    
    public void adicionar(CalculoEstrella ar){
        list.add(ar);
    }

    public List<CalculoEstrella> getList() {
        return list;
    }

    public void setList(List<CalculoEstrella> list) {
        this.list = list;
    }
      
      

}
