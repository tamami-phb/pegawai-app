package lab.phb.pegawaiapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.phb.pegawaiapp.entity.Pegawai;
import lab.phb.pegawaiapp.repo.PegawaiRepo;

@RestController
public class ApiController {

    @Autowired
    private PegawaiRepo pegawaiRepo;

    @RequestMapping("/get-daftar-pegawai")
    public List<Pegawai> getListPegawai() {
        return pegawaiRepo.findAll();
    }

}