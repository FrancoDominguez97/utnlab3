package utn.obejtos.tp2;

import java.util.Arrays;
import java.util.*;

//titulo, precio, stock y Autor
public class Book {
    private String title;
    private double price;
    private int stock;
    private Author[] authors;

    public Book(String title, double price, int stock, Author[] authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String printAuthors(){
        String names = "";
        for (Author author : authors){
            if(author!=null) {
                names += author.getName() + " " + author.getLastName() + ". ";
            }
        }
        return "El libro " + this.title +  " de los autores " + names + "Se vende a $" + this.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", authors=\n" + Arrays.toString(authors) +
                '}';
    }
}
