package com.example.ktpapi.service;

import com.example.ktpapi.dto.KtpDTO;
import com.example.ktpapi.entity.Ktp;

import java.util.List;

public interface KtpService {

    Ktp create(KtpDTO dto);

    List<Ktp> getAll();

    Ktp getById(Integer id);

    Ktp update(Integer id, KtpDTO dto);

    void delete(Integer id);

}