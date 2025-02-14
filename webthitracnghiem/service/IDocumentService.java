package com.tttn.webthitracnghiem.service;

import com.tttn.webthitracnghiem.entity.Document;
import com.tttn.webthitracnghiem.entity.DocumentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IDocumentService {
    Page<Document> findAll(Pageable pageable);
    Document findById(int id);
    Page<Document> findByTitle(String title, Pageable pageable);
    Document save(DocumentRequest documentRequest);
    void remove(Document document);
    List<Document> findAll();
    void save(Document document);
}
