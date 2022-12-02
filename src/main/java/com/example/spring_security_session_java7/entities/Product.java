package com.example.spring_security_session_java7.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @SequenceGenerator(name = "product_seq",sequenceName = "product_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
    private Long id;
    private String name;
    private String brand;
    private double price;

}
