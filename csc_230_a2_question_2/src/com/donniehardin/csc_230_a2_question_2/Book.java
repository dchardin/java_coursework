package com.donniehardin.csc_230_a2_question_2;


public class Book {
    
    private String name;
    
    private Author author;
    
    private double price;
    
    private int qtyInStock;
    
    public Book(String name, Author author, double price, int qtyInStock) {
        
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
        
    }
    
    
    public String getName() {
        return name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice() {
        return price;      
    }
    
    public int getQtyInStock() {
        return qtyInStock;
        
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }    
    
    @Override
    public String toString() {
        
        return String.format("%s/%s/%f/%d", name, author, price, qtyInStock);
        
    }



    
}
