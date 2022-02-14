package com.spring.hibernate.repositories;

import com.spring.hibernate.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lilith
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    

}
