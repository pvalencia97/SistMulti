/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes1;

import jade.core.Agent;
import java.util.Hashtable;
import jade.core.behaviours.OneShotBehaviour;

public class Vendedor extends Agent{
    
    private Hashtable catalogo;
    
    private InterfazVendedor GUI;
    
    @Override
    protected void setup(){
        
        System.out.println("Hola, soy el agente vendedor: " + getAID().getName());
        
        catalogo = new Hashtable();
        
        GUI = new InterfazVendedor(this);
        
        GUI.show();
        
        //addBehaviour( new OfferRequestServer() );
        //addBehaviour( new PurchaseOrderServer() );
        
    }        

    
    @Override
    protected void takeDown(){
        System.out.println("Finalizando el agente vendedor: " + getAID().getName());
        GUI.dispose();
    }
    
    protected void actualizarCatalogo(final String titulo, final int precio){
        addBehaviour(
                new OneShotBehaviour(){
                    @Override
                    public void action(){
                        catalogo.put(titulo, new Integer(precio));
                        System.out.println(titulo + " Ha sido agregado al catalogo -- Precio: $" + precio);
                        
                    }
                }
        );
    }
    
}
