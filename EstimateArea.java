
package estimate.area;

import java.util.Scanner;


public class EstimateArea {

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        final double radius = 6371.01;
        System.out.println("enter (latitude,longtitude) for 1st(Atalanta) city ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        
        System.out.println("enter (latitude,longtitude) for 2nd(Orlando) city ");
        
        double x2  =Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());
        
        System.out.println("enter (latitude,longtitude) for 3rd(Savannah) city ");
        double x3 = Math.toRadians(input.nextDouble());
        double y3 = Math.toRadians(input.nextDouble());
        
        System.out.println("enter (latitude,longtitude) for 4th(Charlotte) city ");
        double x4 = Math.toRadians(input.nextDouble());
        double y4 = Math.toRadians(input.nextDouble());
        
        double cosAO = (Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y2-y1));
       if(cosAO>1){
           cosAO=1;
       }
       if(cosAO<-1){
           cosAO=-1;
       } 
        double a1 = radius*Math.acos(cosAO);
        
        double cosOS = (Math.sin(x2)*Math.sin(x3)+Math.cos(x2)*Math.cos(x3)*Math.cos(y3-y2));
        if(cosOS>1){
           cosOS=1;
        }
       if(cosOS<-1){
           cosOS=-1;
       }
       double b1 = radius*Math.acos(cosOS);
       
       
       double cosSA = (Math.sin(x1)*Math.sin(x3)+Math.cos(x1)*Math.cos(x3)*Math.cos(y3-y1));
        if(cosSA>1){
           cosSA=1;
        }
       if(cosSA<-1){
           cosSA=-1;
       }
       double c1 = radius*Math.acos(cosSA);
        
       double p1 = (a1+b1+c1)/2;
       double area1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));

       
       double cosSC = (Math.sin(x4)*Math.sin(x3)+Math.cos(x4)*Math.cos(x3)*Math.cos(y4-y3));
        if(cosSC>1){
           cosSC=1;
        }
       if(cosSC<-1){
           cosSC=-1;
       }
        double b2 = radius*Math.acos(cosSC);
        
       double cosCA = (Math.sin(x4)*Math.sin(x1)+Math.cos(x4)*Math.cos(x1)*Math.cos(y4-y1));
        if(cosCA>1){
           cosCA=1;
        }
       if(cosCA<-1){
           cosCA=-1;
       }
        double c2 = radius*Math.acos(cosCA);
        double p2 = (c1+c2+b2)/2;
        double area2 = Math.sqrt(p2*(p2-c1)*(p2-c2)*(p2-b2));
        double totalArea = area1+area2;
        System.out.println("the total area is " + totalArea);
        
        
        
        


                
                
                }
    }
        
    
