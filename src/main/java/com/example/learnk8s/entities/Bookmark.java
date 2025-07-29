package com.example.learnk8s.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "Bookmark")
public class Bookmark {

    /*
    will create sequence in here
    * */
    @Id
    @SequenceGenerator(name = "bm_id_sequence_gen", sequenceName = "bm_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_sequence_gen")
    private Long id;

    private String title;
    private String url;
    private Instant createAt;

    /*

    @PrePersist
    public void prePersist() {
        this.createAt = Instant.now();
    }

    * */

    public Bookmark() {
    }

    public Bookmark(Long id, String title, String url, Instant createAt) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.createAt = createAt;
    }

    public Bookmark(String title, String url) {
        this.title = title;
        this.url = url;
        this.createAt = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateAt() {
        return createAt != null ? getCreateAt().toString() : null;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }
}
