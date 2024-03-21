package com.tttn.webthitracnghiem.service;

import com.tttn.webthitracnghiem.entity.IQ;

import java.util.List;

public interface IQService {
    void save(IQ iq);
    List<IQ> findAll();
    List<IQ> findByUser(String un);
}
