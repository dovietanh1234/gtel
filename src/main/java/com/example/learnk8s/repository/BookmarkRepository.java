package com.example.learnk8s.repository;

import com.example.learnk8s.entities.Bookmark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    @Query(value = "SELECT b from Bookmark b")
    Page<Bookmark> findBookmarks(Pageable pageable);
}
