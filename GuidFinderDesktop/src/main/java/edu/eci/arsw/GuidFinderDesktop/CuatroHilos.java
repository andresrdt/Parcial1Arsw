/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop;

import java.util.Arrays;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 2112076
 */
public class CuatroHilos {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GuidFinderDesktopApplication.class, args);
        Hilos hilo1 = new Hilos(1);
        Hilos hilo2 = new Hilos(2);
        Hilos hilo3 = new Hilos(3);
        Hilos hilo4 = new Hilos(4);
        while (true) {
            /**if (args.length > 10) {
                hilo1.wait(10000);
                hilo2.wait(10000);
                hilo3.wait(10000);
                hilo4.wait(10000);
            }**/
            hilo1.agregeBusque(args);
            hilo2.agregeBusque(args);
            hilo3.agregeBusque(args);
            hilo4.agregeBusque(args);
            hilo1.run();
            hilo2.run();
            hilo3.run();
            hilo4.run();
        }
    }
}
