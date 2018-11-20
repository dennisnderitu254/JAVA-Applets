/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.util.Scanner;


public class Business {
    double buying_price;
    double transport_cost;
    double selling_price;
    
    Business()
    {
        buying_price=0.0;
        transport_cost=0.0;
        selling_price=0.0;
        
    }
    Business(double b, double t, double s)
    {
        buying_price=b;
        transport_cost=t;
        selling_price=s;
    }
    public void computeProfitLoss(double b, double t, double s)
    {
      double totalBuyingPrice;
      totalBuyingPrice=b+t;
      if(s>totalBuyingPrice)
      {
          System.out.println("Profit");
          
      }
     else
          
       System.out.println("Loss");   
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Business[] product=new Business[100];
        double b,t,s;
        Scanner reader=new Scanner(System.in);
        for(int i=0;i<100;i++)
        {
            
         product[i]=new Business();
        System.out.println("Enter the buying price of the product at "+i);
        b = reader.nextDouble();
        System.out.println("Enter the  transport "
                + "cost used at "+i);
        t = reader.nextDouble();
        System.out.println("Enter the selling price of the product at "+i);
        s = reader.nextDouble();
        
        product[i].computeProfitLoss(b, t, s);
        }
               
        
    }
   
    
    
    
    
}
