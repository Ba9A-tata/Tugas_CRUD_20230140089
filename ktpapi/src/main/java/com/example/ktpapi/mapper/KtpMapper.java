package com.example.ktpapi.mapper;

import com.example.ktpapi.dto.KtpDTO;
import com.example.ktpapi.entity.Ktp;

public class KtpMapper {

    public static Ktp toEntity(KtpDTO dto){

        Ktp ktp = new Ktp();

        ktp.setNomorKtp(dto.getNomorKtp());
        ktp.setNamaLengkap(dto.getNamaLengkap());
        ktp.setAlamat(dto.getAlamat());
        ktp.setTanggalLahir(dto.getTanggalLahir());
        ktp.setJenisKelamin(dto.getJenisKelamin());

        return ktp;
    }

}