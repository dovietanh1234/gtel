package com.example.learnk8s.service;

import com.example.learnk8s.entities.Bookmark;

import java.util.List;

public interface BookmarkService {
    List<Bookmark> findAllBookmarks();
}
