package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparator.ProductAvailability;
import com.model.Product;

public class Main {
	public static void main(String[] args) {
	List<Product> booksList = new ArrayList<>();
	booksList.add(new Product(1, "1990", "Frank Jason", "Running for Dummies", false));
	booksList.add(new Product(2, "1920", "O. Henry", "Complete Stories", true));
	booksList.add(new Product(3, "2020", "Ann Kaldren", "How to Code in a Tech Oriented World", false));
	booksList.add(new Product(4, "2010", "Kallie Jackson", "Learn Mental Models and Change Your Life", true));
	booksList.add(new Product(5, "1990", "Liam Koel", "Razor: A Memoir", true));
	
	System.out.println("Printing All Books: ");
	
	printer(booksList);
	
	Collections.sort(booksList, new ProductAvailability());
	
	System.out.println("\n\n\n");
	
	System.out.println("Printing Books Sorted By Author");
	
	Collections.sort(booksList, (Product p1, Product p2)->{
		String s1 = p1.getAuthor();
		String s2 = p2.getAuthor();
		return s1.compareTo(s2);
	});
	
	printer(booksList);
	
	System.out.println("\n\n\n");
	
System.out.println("Printing Books Sorted By Title");
	
	Collections.sort(booksList, (Product p3, Product p4)->{
		String i1 = p3.getTitle();
		String i2 = p4.getTitle();
		return i1.compareTo(i2);
	});
	
	printer(booksList);
	
	System.out.println("\n\n\n");
	
System.out.println("Printing Books Sorted By Year Published");
	Collections.sort(booksList, (Product p5, Product p6)->{
		String i1 = p5.getYearPublished();
		String i2 = p6.getYearPublished();
		int x = i1.compareTo(i2);
		if (x==0) {
			String i3 = p5.getTitle();
			String i4 = p6.getTitle();
			x= i3.compareTo(i4);
		}
		return x;
});
	
	printer(booksList);
	}
	
	public static void printer(List<Product> booksList) {
		for (Product p: booksList) {
			System.out.println(p);
		}
	}
}
