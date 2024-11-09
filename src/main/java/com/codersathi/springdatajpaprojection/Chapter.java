package com.codersathi.springdatajpaprojection;

import jakarta.persistence.*;

@Entity
public class Chapter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
}
