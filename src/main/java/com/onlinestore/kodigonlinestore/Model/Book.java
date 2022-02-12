package com.onlinestore.kodigonlinestore.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book")
public class Book extends Item{
    private String author;
    private String editorial;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="idBook")
    @JsonBackReference
    private List<ItemOrder> itemOrder;
}
