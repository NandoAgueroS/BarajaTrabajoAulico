/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barajatrabajoaulico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NandoJ
 */
public class Baraja {
    private List<Carta> cartas;
    
    public Baraja() {
        cartas=new ArrayList<>();
        String[]palos={"Espada","Oro","Basto","Copa"};
        for (String palo : palos) {
            for(int numero=1;numero<=12;numero++){
                if(numero!=8  && numero!=9){
                    cartas.add(new Carta(numero,palo));
                    
                }
            }
        }
    }
    
    public void baraja(){
        Collections.shuffle(cartas);
        
        
}
    
    public void siguenteCarta(){
        cartas.empty();
    }
}
