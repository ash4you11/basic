package com.basic;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car hondaCity=new Car(1200000,80,150,"Honda","city","sedan");
		
		Car marutiSwift=new Car(600000,75,100,"Maruti","swift","hatchBack");
		
		Car hundaiI20=new Car(700000,78,120,"Hundai","i20","sedan");
		
        Car marutiSeaz=new Car(1300000,95,180,"Maruti","seaz","hatchBack");
		
		Car hondaAmaze=new Car(700000,70,90,"Honda","Amaze","hatchBack");
				
		ArrayList<String>  compAttr=new ArrayList();
		compAttr.add("0 : price");
		compAttr.add("1 : AvgSpeed");
		compAttr.add("2 : H.P");
			
		ArrayList<Car> carList=new ArrayList<>();	
		carList.add(hondaCity);
		carList.add(marutiSwift);
		carList.add(hundaiI20);
		carList.add(marutiSeaz);
		carList.add(hondaAmaze);
		
		System.out.println("S.No "+   "  Make  "+"       Name  "+"       Type  "+"         Price  "+"        enginePower   "+"    AvgSpeed");
		System.out.println("--------------------------------------------------------------------------");
		
		
		for(int i=0;i<carList.size();i++) {
			Car car=carList.get(i);
			System.out.println(i+"   "+car.make +"        "+car.name+"      "+car.type+"          "+car.price+"        "+car.enginePower+"             "+car.avgSpeed);
			
		}
		
		
		System.out.println("\n\n select any two car for comparision");
		
		Scanner scn=new Scanner(System.in);
		 int a=scn.nextInt();
		 int b=scn.nextInt();
		 
		 if((a<=4 && b<=4 ) && a!=b ) {
			 System.out.println("You have selected car "+a+" and car "+b);
			 
			 
			 
			 Car carA=carList.get(a);
			 Car carB=carList.get(b);
			 
			
			 
			 
			 /*System.out.println("Please Enter the Comparision Attr");
			 
			 for(int i=0;i<compAttr.size();i++) {
				 System.out.println(compAttr.get(i));
				 
			 }
			 
			 Scanner scn1=new Scanner(System.in);
			    int comAttrNo=scn1.nextInt();
			 
			    */
			 
			 // comparision logic
			    
				   switch(0) {
				   
			     
			    case 0:
			    	//---
			    	if(carA.price<carB.price) {
			    		System.out.println(carA.make+"  "+carA.name+"  is cheaper than  "+carB.make +""+carB.name);
			    	}else {
			    		System.out.println(carA.make+"  "+carA.name+"  is costlier than  "+carB.make +""+carB.name);
			    	}
			    	
			    	
			    case 1:
			    	
			    	
			    	
			    	if(carA.avgSpeed<carB.avgSpeed) {
			    		System.out.println(carA.make+"  "+carA.name+" has less speed than "+carB.make +""+carB.name);
			    	}else {
			    		System.out.println(carA.make+"  "+carA.name+"  has more speed  than  "+carB.make +""+carB.name);
			    	}
			    	
			    	
			    case 2:
			    	
			    	if(carA.enginePower<carB.enginePower) {
			    		System.out.println(carA.make+"  "+carA.name+"  has less power  "+carB.make +""+carB.name);
			    	}else {
			    		System.out.println(carA.make+"  "+carA.name+"  has more power  "+carB.make +""+carB.name);
			    	}
			    }
	
				   
			
				   }
			  
		
		 else {
			 System.err.println("Your entry is invalid");
		 }
		
	}

}
