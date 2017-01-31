/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesctarea01.p03;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RreyesCTarea01P03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner keyboard = new Scanner (System.in);
    double x1;
    double x2;
    double y1;
    double y2;
    double dis;
    
        System.out.println("Ingresa los datos");
        System.out.println("x1");
        x1=keyboard.nextDouble();
        System.out.println("y1");
        y1=keyboard.nextDouble();  
        System.out.println("x2");
        x2=keyboard.nextDouble();
        System.out.println("y2");
        y2=keyboard.nextDouble();
    
    dis= Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("");
        System.out.println("Distancia entre P1 y P"+dis);
    
    
    
    }
    
}
