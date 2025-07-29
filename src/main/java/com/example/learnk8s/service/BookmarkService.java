package com.example.learnk8s.service;

import com.example.learnk8s.dto.model.BookmarkDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookmarkService {
    Page<BookmarkDTO> findAllBookmarks(Pageable pageable);
}
