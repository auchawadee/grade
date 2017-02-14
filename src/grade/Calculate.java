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
public class Calculate implements InterGrade{
    String Grade;
    int a1=100;
    int b1=75;
    int c1=65;
    int d1=55;
    int A=80;
    int B=70;
    int C=60;
    int D=50;
    

    @Override
    public String GRADE(int grade) {
       if(grade > a1){
            
            return Grade="ไม่มีเกรดนี้";
            
        }else if(grade >= A){
             return Grade="A";
             
        }else if(grade >= b1){
             return Grade="B+";
             
        }else if(grade >= B){
             return Grade="B";
        }else if(grade >= c1){
             return Grade="C+";
        }else if(grade >= C){
             return Grade="C";
        }else if(grade >= d1){
             return Grade="D+";
        }else if(grade >= D){
             return Grade="D";
        }else{
            return Grade="E";
        }
    }
    
}
