package oopsQuestions;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
	    Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
      
	    Book.addBook(book1);
        Book.addBook(book2);
       
		ArrayList<Book> bookCollection = Book.getBooksCollection();
		
		for (Book book : bookCollection) {
			
			System.out.println("Title:"+book.getTitle()+"\nAuthor:"+book.getAuthor()+"\nISBN"+book.getISBN()+"\n");
		}
		
		Book.removeBook(book1);
		
	for (Book book : bookCollection) {
			
			System.out.println("Title:"+book.getTitle()+"\nAuthor:"+book.getAuthor()+"\nISBN"+book.getISBN()+"\n");
		}
	
	//********************************************************************************************************
		
	
	//create an object of the Employee class
    
    
	Employee employee1 = new Employee("shubham", "QA", 400000d)  ;       
	Employee employee2 = new Employee("shreyash", "sdet", 600000d)  ;
	
	employee1.printEmployeeDetails();
	employee2.printEmployeeDetails();
	
	employee1.raiseSalary(10);
	employee2.raiseSalary(20);
	
	employee1.printEmployeeDetails();
	employee2.printEmployeeDetails();
	} 
	
//******************************************************************************************************

}
