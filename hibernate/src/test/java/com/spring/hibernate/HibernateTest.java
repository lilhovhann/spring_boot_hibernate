package com.spring.hibernate;

import com.spring.hibernate.domain.Book;
import com.spring.hibernate.services.BookService;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author lilith
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateTest {

    @Autowired
    private BookService bookService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatedInitialRecords(){
        List<Book> books = bookService.findAll();
        
        Assert.assertEquals(books.size(), 3);
    }

}
