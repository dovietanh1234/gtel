package com.example.learnk8s.repository;

import com.example.learnk8s.entities.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    @Query(value = "SELECT b from Bookmark b")
    List<Bookmark> findBookmarks();
}
