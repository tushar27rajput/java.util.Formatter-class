/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Formatter;

/**
 *
 * @author tusshar
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Formatter fmt;
        
        for(int i=1;i<=10;i++)
        {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d", i,i*i,i*i*i);
            System.out.println(fmt);
            fmt.close();
        }
        
    }
    
}
