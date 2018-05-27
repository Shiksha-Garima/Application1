/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacestar;

/**
 *
 * @author hp
 */
public class Spacestar {
    void spaceStar()
    {
        for(int j=1;j<=3;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=1;k++)
        {
            System.out.println("*");
        }
    }
    void line()
   {
            for(int l=1;l<=7;l++)
            {
                System.out.print("*");
            }
            System.out.println();
    }
    public static void main(String a[])
    {
        int i;
        Spacestar p1=new Spacestar();
        for(i=1;i<=7;i++)
        {
            if(i<4){
                p1.spaceStar();
            }
            if(i==4){
                p1.line();
            }
            if(i>4){
                p1.spaceStar();
            }
        }
    }
    
}
