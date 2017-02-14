/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 *
 * @author pamoindy
 */
import
java.util.Scanner;

public class Grade {

   
    public static void main(String[] args) {
           Scanner Cb = new Scanner(System.in);
           System.out.print("Insert Score : ");
         int Grade = Cb.nextInt();
    Calculate grade1 =new Calculate();
    
    grade1.GRADE(Grade);
  
        
    System.out.println("เกรดที่ได้คือ :"+grade1.Grade);
}
}
