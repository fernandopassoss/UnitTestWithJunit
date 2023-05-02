package com.example;

import java.util.*;

public class ShoppingCart {
	
	private ArrayList items;
	
	public ShoppingCart() {
		items = new ArrayList();
	}
	
	//retorna o total em valor do carrinho de compras
	public double getBalance() {
		double balance = 0.00;
		for (Iterator i = items.iterator(); i.hasNext();){
			Product item = (Product)i.next();
			balance += item.getPrice();
		}
		return balance;
	}

	//adiciona o objeto item ao arry items
	public void addItem(Product item) {
		items.add(item);
	}

	//remove um item do vetor caso a exceção (não encontrado)
	//seja ativada
	public void removeItem(Product item)
			throws ProductNotFoundException {
		if (!items.remove(item)) {
			throw new ProductNotFoundException();}
	}
	
	//retorna o tamanho do vetor items
	public int getItemCount() {
		return items.size();
	}
	
	//limpa o vetor items
	public void empty() {
		items.clear();
	}
}

