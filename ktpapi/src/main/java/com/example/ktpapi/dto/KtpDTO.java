package com.example.ktpapi.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class KtpDTO {

    private String nomorKtp;
    private String namaLengkap;
    private String alamat;
    private LocalDate tanggalLahir;
    private String jenisKelamin;

}