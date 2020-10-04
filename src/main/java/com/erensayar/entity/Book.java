package com.erensayar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author ErenSayar
 */
@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "subName", length = 150)
    private String subName;

    @Column(name = "serialName", length = 50)
    private String serialName;

    @Column(name = "isbnNo", length = 13)
    private String isbnNo;

    @Column(name = "explanation", length = 500)
    private String explanation;

    @ManyToMany
    private List<Author> author;

    @ManyToOne
    private Publisher publisher;
}
