package com.example.rest.greeting.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @SequenceGenerator(name = "POSTS_SEQ", allocationSize = 1)                      //Set Increment generator to +1
    @GeneratedValue(generator = "POSTS_SEQ", strategy = GenerationType.SEQUENCE)    //Set column as auto_increment
    private Long id;

    private String slug;
    private String title;
    private String body;

    @CreationTimestamp                                                              //Put the current date as default value
    private Date created_at;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
