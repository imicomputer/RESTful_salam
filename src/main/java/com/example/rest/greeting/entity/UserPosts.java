package com.example.rest.greeting.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class UserPosts {
    @Id
    @SequenceGenerator(name = "POSTS_SEQ", allocationSize = 1)                      //Set Increment generator to +1
    @GeneratedValue(generator = "POSTS_SEQ", strategy = GenerationType.SEQUENCE)    //Set column as auto_increment
    private Long id;

    private String slug;
    private String title;
    private String body;
    private Date created;    
    private String username;

	public UserPosts(Long id, String slug, String title, String body, Date created, String username) {
		this.slug = slug;
		this.title = title;
		this.body = body;
		this.created = created;
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserPosts [id=" + id + ", slug=" + slug + ", title=" + title + ", body=" + body + ", created=" + created
				+ ", username=" + username + "]";
	}

    
}
