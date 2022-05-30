package com.mb.jpa.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "book_name")
	private String bookName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "book_story", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "story_id"))
	private Set<Story> storySet = new HashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getBookName()
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public Set<Story> getStorySet()
	{
		return storySet;
	}

	public void setStorySet(Set<Story> storySet)
	{
		this.storySet = storySet;
	}

}
