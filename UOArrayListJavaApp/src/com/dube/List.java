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

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class List {
    
    static int maxsize = 15;
    private int size;
    private int[] Item;

    public List () { 
        this.size = 0;
        this.Item = new int[maxsize];    
    }
   
 /**
 * Determines is list is empty
 * @param 
 * @return return true is size(number of items) in list is 0, and false otherwise
 */ 
   boolean IsEmpty () { return size==0;}
   
 /**
 * Determines if list is full and cannot add more items
 * @param 
 * @return return true is size(number of items) in list is maxsize, and false otherwise
 */
   boolean IsFull () {
       return (this.size == maxsize); 
   }
   
 /**
 * Add a new item e into the list
 * @param  e - the item to be added to the list
 * 
 */
   public void Insert (int e)
   {
     if (!(this.IsFull()))
     {    this.Item[this.size] = e;
          this.size++;
     }
   }
 /**
 * Exchange/swap the item values at index positions i and j
 * @param  i  first index position
 * @param  j   second index position
 * 
 */ 
   
   private void Swap (int i, int j)
   {                                
      int Temp = this.Item[i];
      this.Item[i] = this.Item[j];
      this.Item[j] = Temp;
    } 
   
 /**
 * remove specified item e from the list
 * @param  e the item to be removed from the the list
 *  
 */
   public void Delete (int e)
    { 
      int index = 0;    
    if  (!(this.IsEmpty()))
      {
        while ((index  < this.size) && (this.Item[index] != e) )
           index++;
        if ((this.Item[index] == e) && (index  <= this.size-1))
        {  
         Swap (index, this.size-1);
            
         this.size--;
        }
      }
    }
  
 /**
 * Display all items values on the list to standard output
 */
 public void ShowData ()
    { for (int index = 0; index < this.size; index++)
        System.out.format("%d\t", this.Item[index]);
      System.out.println();   
    }
   
    
}

