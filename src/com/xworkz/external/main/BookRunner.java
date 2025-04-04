package com.xworkz.external.main;

import com.xworkz.external.Book;
import com.xworkz.external.internal.StoryBook;

public class BookRunner {
    public static void main(String[] args){
        Book book=new Book();
        book.colour();
        book.copies();
        book.price();
        book.copies();
        book.size();

        Book book1=new StoryBook();
        book1.size();
        book1.colour();
        book1.pages();
        book1.copies();
        book1.price();

        Book book2=new StoryBook();
        book2.size();
        book2.colour();
        book2.pages();
        book2.copies();
        book2.price();

        Book book3=new StoryBook();
        book3.size();
        book3.colour();
        book3.pages();
        book3.copies();
        book3.price();

    }
}
