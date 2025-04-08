package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Book;
import com.xworkz.external.internal.StoryBook;
import com.xworkz.external.internal.ZanduBalm;

public class BookCast {
    public void apply(Book book){
       book.price();
       book.copies();
       book.pages();
       book.size();
       book.colour();

        if(book instanceof StoryBook){
            StoryBook storyBook=new StoryBook();
            storyBook.buy();
        }
    }
}
