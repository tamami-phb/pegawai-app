package lab.phb.pegawaiapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab.phb.pegawaiapp.entity.Pegawai;

@Repository
public interface PegawaiRepo extends JpaRepository<Pegawai, Integer>  {

}