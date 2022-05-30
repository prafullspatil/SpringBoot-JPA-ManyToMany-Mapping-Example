package com.mb.jpa.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Story
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "story_name")
	private String storyName;

	@ManyToMany(mappedBy = "storySet", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("storySet")
	private Set<Book> bookSet = new HashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getStoryName()
	{
		return storyName;
	}

	public void setStoryName(String storyName)
	{
		this.storyName = storyName;
	}

	public Set<Book> getBookSet()
	{
		return bookSet;
	}

	public void setBookSet(Set<Book> bookSet)
	{
		this.bookSet = bookSet;
	}

}
