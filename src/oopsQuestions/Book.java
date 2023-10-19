package oopsQuestions;

import java.util.ArrayList;

public class Book {
private String title;
private String author;
private String isbn;
private static ArrayList<Book> bookCollection = new ArrayList<Book> ();

public Book(String title,String author,String isbn) {
	this.title=title;
	this.author=author;
	this.isbn=isbn;
	}
public String getAuthor() {
	return this.author;
}
public void setAuthor(String author) {
	this.author=author;
}

public String getISBN() {
	return this.isbn;
}
public void setISBN(String isbn) {
	this.isbn=isbn;
}

public String getTitle() {
	return this.title;
}
public void setTitle(String title) {
	this.title=title;
}

public static ArrayList<Book> getBooksCollection() {
	return bookCollection;
}

public static void addBook(Book book) {
	bookCollection.add(book);
}

public static void removeBook(Book book) {
	bookCollection.remove(book);
}

}
