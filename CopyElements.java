package setunion;//created package as as setunion

import java.util.HashSet;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//hashset class implements the set interface,it uses hashtable to store the elements and contains only unique elements
import java.util.Set;//set is a collection that cannot contain duplicate elements
/**
 * 
 * in here creating a class name CopyElements this class will..
 * copy all the elements from set2 to set1 and then..
 * set1 becomes the union of set1 and set2.
 *
 */
public class CopyElements {//created class name as CopyElements
	                     //classes are the basics oops(object oriented programming language)
	// main method
	public static void main(String args[]) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter		
        /**
         * in here creating an object of set(set1) 
         * and adding some elements(mobile brands) it.
         */
        Set<String> set1 = new HashSet<String>();
        set1.add("MI");//adding MI
        set1.add("Samsung");//adding Samsung
        set1.add("Apple");//adding Apple
        set1.add("Oppo");//adding Oppo
        set1.add("Vivo");//adding Vivo
        
        /**
         * in here creating an another object of set(set2) 
         * and adding some elements(laptops brands) it.
         */
        Set<String> set2 = new HashSet<String>();//adding set2 elements
        set2.add("Acer");//adding Acer
        set2.add("Lenovo");//adding Lenovo
        set2.add("Asus");//adding Asus
        set2.add("Mac");//adding Mac
        set2.add("HP");//adding Hp
      
       System.out.println("Set1 Mobiles :" + set1);//prints set1 elements
       	
       System.out.println("Set2 Laptops:" + set2);//prints set2 elements
       //system is used to return code
       //out is a static member
       //println is used to print text and gives output
       
       /**
        * coped all the elements from set2 to set1..
        * and printing the union of set1 and set2.
        */
       System.out.println("After copying elements from set2 to set1");
       //system is used to return code
       //out is a static member
       //println is used to print text and gives output
       set1.addAll(set2);
       System.out.println("\nProducts:" + set1);//system is used to return code
       //out is a static member
       //println is used to print text and gives output
        
      


}
}