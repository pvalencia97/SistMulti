/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes1;

import jade.core.Agent;

public class Agente extends Agent{
    
    protected void setup(){
        System.out.println("\n --> Hola, soy el agente: "+ getAID().getName());
    }
    
}
