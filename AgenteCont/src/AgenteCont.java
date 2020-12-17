/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import jade.core.Agent;
/**
 *
 * @author jose6
 */
public class AgenteCont {
    Comportamiento comp = new Comportamiento();
    public void setup(){
        this.addBehaviour(comp);
    }
}
