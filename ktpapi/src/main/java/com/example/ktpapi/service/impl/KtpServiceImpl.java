package com.example.ktpapi.service.impl;

import com.example.ktpapi.dto.KtpDTO;
import com.example.ktpapi.entity.Ktp;
import com.example.ktpapi.mapper.KtpMapper;
import com.example.ktpapi.repository.KtpRepository;
import com.example.ktpapi.service.KtpService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository){
        this.repository = repository;
    }

    @Override
    public Ktp create(KtpDTO dto){

        if(repository.findByNomorKtp(dto.getNomorKtp()).isPresent()){
            throw new RuntimeException("Nomor KTP sudah ada");
        }

        Ktp ktp = KtpMapper.toEntity(dto);

        return repository.save(ktp);
    }

    @Override
    public List<Ktp> getAll(){
        return repository.findAll();
    }

    @Override
    public Ktp getById(Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
    }

    @Override
    public Ktp update(Integer id, KtpDTO dto){

        Ktp ktp = getById(id);

        ktp.setNomorKtp(dto.getNomorKtp());
        ktp.setNamaLengkap(dto.getNamaLengkap());
        ktp.setAlamat(dto.getAlamat());
        ktp.setTanggalLahir(dto.getTanggalLahir());
        ktp.setJenisKelamin(dto.getJenisKelamin());

        return repository.save(ktp);
    }

    @Override
    public void delete(Integer id){

        Ktp ktp = getById(id);

        repository.delete(ktp);
    }
}