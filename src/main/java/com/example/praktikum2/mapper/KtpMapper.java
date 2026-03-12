package com.example.praktikum2.mapper;

import com.example.praktikum2.model.dto.KtpDto;
import com.example.praktikum2.model.entity.Ktp;

public class KtpMapper {

    public static KtpDto toDto(Ktp ktp){

        KtpDto dto = new KtpDto();

        dto.setId(ktp.getId());
        dto.setNomorKtp(ktp.getNomorKtp());
        dto.setNamaLengkap(ktp.getNamaLengkap());
        dto.setAlamat(ktp.getAlamat());
        dto.setTanggalLahir(ktp.getTanggalLahir());
        dto.setJenisKelamin(ktp.getJenisKelamin());

        return dto;
    }

}