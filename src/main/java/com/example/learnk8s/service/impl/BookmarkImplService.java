package com.example.learnk8s.service.impl;

import com.example.learnk8s.dto.model.BookmarkDTO;
import com.example.learnk8s.entities.Bookmark;
import com.example.learnk8s.repository.BookmarkRepository;
import com.example.learnk8s.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookmarkImplService implements BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public Page<BookmarkDTO> findAllBookmarks(Pageable pageable) {

        List<BookmarkDTO> content = bookmarkRepository.findBookmarks(pageable).getContent()
                .stream()
                .map(b -> new BookmarkDTO(
                        b.getId(),
                        b.getTitle(),
                        b.getUrl()
                ))
                .toList();

        return new PageImpl<>(content, pageable, content.size());
    }
}
