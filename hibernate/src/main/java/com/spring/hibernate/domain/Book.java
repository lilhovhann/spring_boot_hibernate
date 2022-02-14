package com.spring.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author lilith
 */
@Entity
@Data
public class Book {
    
    @Id
    private Long id;
    
    private String name;

   

}
