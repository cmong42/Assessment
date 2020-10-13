package com.treeSetComparator;

import java.util.Comparator;

import com.model.Product;

public class TreeSetComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		Boolean b1 = o1.isAvailable();
		Boolean b2 = o2.isAvailable();
		return b2.compareTo(b1);
	}
	

}
