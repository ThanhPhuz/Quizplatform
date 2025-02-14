package com.tttn.webthitracnghiem.service;

import com.tttn.webthitracnghiem.entity.Exam;
import com.tttn.webthitracnghiem.entity.ExamRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IExamService {
    Page<Exam> findAll(Pageable pageable);
    Exam save(ExamRequest examRequest);
    List<Exam> findAllBySubject(int id);
    Iterable<Exam> findAll();

    List<Exam> getAll();

    Exam findById(Integer id);

    void save(Exam exam);

    void delete(Exam exam);

    Page<Exam> findAllBySubject(int id, Pageable pageable);
    Page<Exam> findAllByLesson(int id, Pageable pageable);

    Page<Exam> findAllByNameExamContaining(String name, Pageable pageable);
    Page<Exam> findAllByNameExamContainingAndBySubject(int id, String name, Pageable pageable);
    Page<Exam> findAllByNameExamContainingAndByLesson(int id, String name, Pageable pageable);
}
