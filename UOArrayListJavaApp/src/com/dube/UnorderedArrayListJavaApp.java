/*
 *******************************************************
 * 2019 (C) EL Dube Enteprises
 * Free and Open Source License Granted by the developer 
 *
 * Developed By: Enock Lukhetfo Dube
 *               Department of Computer Science
 *               University of Eswatini
 *******************************************************
 */
package com.dube;

import java.io.IOException;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class UnorderedArrayListJavaApp {

    public static void main(String[] args) {
       
        List L = new List();
	
	for (int i=0; i<10; i++)
            L.Insert (i+5);
        
	L.Insert (10); 
        L.Insert (15);  
        L.Insert (20);
	L.ShowData ();
              
        L.Delete(5);
        L.ShowData ();
               
        L.Insert(30); L.Insert(50); L.Insert(300); 
	L.ShowData ();
	
	L.Delete (10); 
	L.ShowData ();
	    
    }
    
}
