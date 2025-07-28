package com.example.learnk8s.service.impl;

import com.example.learnk8s.entities.Bookmark;
import com.example.learnk8s.repository.BookmarkRepository;
import com.example.learnk8s.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookmarkImplService implements BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public List<Bookmark> findAllBookmarks() {
        return bookmarkRepository.findBookmarks();
    }
}
