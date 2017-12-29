package lab.phb.pegawaiapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Pegawai {

    @Id @Getter @Setter
    private int id;
    @Getter @Setter
    private String nama;
    @Getter @Setter
    private String jabatan;

}