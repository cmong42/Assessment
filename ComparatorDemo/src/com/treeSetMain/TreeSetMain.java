package com.treeSetMain;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.model.Product;

public class TreeSetMain {
	public static void main(String[] args) {
	TreeSet<String> booksList=new TreeSet<String>();
	booksList.add("1, 1990, Frank Jason, Running for Dummies, false");
	booksList.add("2, 1920, O. Henry, Complete Stories, true");
	booksList.add("3, 2020, Ann Kaldren, How to Code in a Tech Oriented World, false");
	booksList.add("4, 2010, Kallie Jackson, Learn Mental Models and Change Your Life, true");
	booksList.add("5, 1990, Liam Koel, Razor: A Memoir, true");
	
	System.out.println("Printing All Books: ");
	
	for (String i: booksList) {
		System.out.println(i);
	}
	
	System.out.println("\n\n\n");
	}
	
	
}
