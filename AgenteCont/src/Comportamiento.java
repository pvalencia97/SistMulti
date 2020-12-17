/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author jose6
 */
public class Comportamiento {
    int n=0;
    public void action() {
        System.out.println(n);
    }

    public boolean done() {
        if(n==100)
            return true;
        n++;
        return false;
    }
}
