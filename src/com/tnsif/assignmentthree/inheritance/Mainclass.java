package com.tnsif.assignmentthree.inheritance;

import com.tnsif.assignmentthree.composition.*;

public class Mainclass {
	
	public static void main(String[] args) {
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);
       
        
        
        book.displayInfo();
        magazine.displayInfo();
        
       

       
    }

}