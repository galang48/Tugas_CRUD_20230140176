package com.example.praktikum2.service.impl;

import com.example.praktikum2.mapper.KtpMapper;
import com.example.praktikum2.model.dto.KtpAddRequest;
import com.example.praktikum2.model.dto.KtpDto;
import com.example.praktikum2.model.entity.Ktp;
import com.example.praktikum2.repository.KtpRepository;
import com.example.praktikum2.service.KtpService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository) {
        this.repository = repository;
    }

    @Override
    public KtpDto create(KtpAddRequest request) {

        Ktp ktp = new Ktp();

        ktp.setNomorKtp(request.getNomorKtp());
        ktp.setNamaLengkap(request.getNamaLengkap());
        ktp.setAlamat(request.getAlamat());
        ktp.setTanggalLahir(request.getTanggalLahir());
        ktp.setJenisKelamin(request.getJenisKelamin());

        repository.save(ktp);

        return KtpMapper.toDto(ktp);
    }

    @Override
    public List<KtpDto> getAll() {

        return repository.findAll()
                .stream()
                .map(KtpMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public KtpDto getById(Integer id) {

        Ktp ktp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        return KtpMapper.toDto(ktp);
    }

    @Override
    public KtpDto update(Integer id, KtpAddRequest request) {

        Ktp ktp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        ktp.setNomorKtp(request.getNomorKtp());
        ktp.setNamaLengkap(request.getNamaLengkap());
        ktp.setAlamat(request.getAlamat());
        ktp.setTanggalLahir(request.getTanggalLahir());
        ktp.setJenisKelamin(request.getJenisKelamin());

        repository.save(ktp);

        return KtpMapper.toDto(ktp);
    }

    @Override
    public void delete(Integer id) {

        Ktp ktp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        repository.delete(ktp);
    }
}