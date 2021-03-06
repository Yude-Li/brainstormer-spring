package com.yude.brainstormerspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
// @EqualsAndHashCode(exclude = "author")
public class Idea {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @JsonIgnore
    private long id;

    @Column(unique = false, nullable = false)
    private String title;

    @Column(unique = false, nullable = false)
    private String context;

    @Column(unique = false, nullable = false)
    private String content;

    @OneToOne
    private Idea originalIdea;

    @ManyToOne
    // @JsonIgnore
    private Brain author;
}