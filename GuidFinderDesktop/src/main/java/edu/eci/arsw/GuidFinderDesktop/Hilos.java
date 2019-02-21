/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop;

import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2112076
 */
public class Hilos extends Thread {

    GuidFinder finder;
    int id;
    public  String[] busque;
    public Hilos(int id) throws Exception {
        this.busque = null;
        finder = new GuidFinder();
        this.id = id;
    }
    public void agregeBusque(String[] args){
       busque=args;
    }
    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            System.out.println("hilo " + this.id + " tiene");
            System.out.println(finder.countGuids(UUID.fromString("7ca4e198-3429-48b5-a97d-f72d6bee6eb0")));
            try {
                Thread.sleep(1000);
                flag=false;
            } catch (InterruptedException ex) {
                Logger.getLogger(GuidFinder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
