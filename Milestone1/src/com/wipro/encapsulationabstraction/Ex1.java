package com.wipro.encapsulationabstraction;
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String authorName="ABCD";
		String email="abc@mail.com";
		char gender='M';
		Author author=new Author(authorName,email,gender);
		String bookName="The ABCD Book";
		double price=120.123;
		int qtyInStock=2000;
		Book book=new Book(bookName,author,price,qtyInStock);
		System.out.println("Book Details:");
		System.out.println(book.getName());
		System.out.println(book.getAuthor().getName()+" "+book.getAuthor().getEmail()+" "+book.getAuthor().getGender());
		System.out.println("Rs. "+book.getPrice());
		System.out.println("Available "+book.getQtyInStock());
	}

}
