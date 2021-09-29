/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.CalculoSatelite;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Saul
 */
public class Arreglo_CalculoSatelite {
       private List<CalculoSatelite> list = new ArrayList();
       
       
        public Arreglo_CalculoSatelite() {
        list.add(new CalculoSatelite("Saul","Mallqui", 65, 1));
        

    }

    //Para ingresar 1x1 desde un formulario
    
    public void adicionar(CalculoSatelite ar){
        list.add(ar);
    }

    public List<CalculoSatelite> getList() {
        return list;
    }

    public void setList(List<CalculoSatelite> list) {
        this.list = list;
    }


   

}
