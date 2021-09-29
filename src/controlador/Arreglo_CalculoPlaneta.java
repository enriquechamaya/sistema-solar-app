/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.CalculoPlaneta;
import java.util.ArrayList;
import java.util.List;


public class Arreglo_CalculoPlaneta {
      private List<CalculoPlaneta> list = new ArrayList();
      
      public Arreglo_CalculoPlaneta() {
        list.add(new CalculoPlaneta("Pepito","luna", 80, 1));
        
        

    }
        public void adicionar(CalculoPlaneta ar){
        list.add(ar);
    }

    public List<CalculoPlaneta> getList() {
        return list;
    }

    public void setList(List<CalculoPlaneta> list) {
        this.list = list;
    }
      
        
}
