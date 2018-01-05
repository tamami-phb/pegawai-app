package lab.phb.pegawaiapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST)
    public void tambah(@RequestBody Pegawai pegawai) {
        //System.out.println("id : " + pegawai.getId());
        //System.out.println("nama : " + pegawai.getNama());
        //System.out.println("jabatan : " + pegawai.getJabatan());
        pegawaiRepo.save(pegawai);
    }

    @RequestMapping(value = "/api/delete/{id}", method = RequestMethod.DELETE)
    public void hapus(@PathVariable("id") int id) {
        pegawaiRepo.delete(id);
    }

}