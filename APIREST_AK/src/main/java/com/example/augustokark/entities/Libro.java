package com.example.augustokark.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited

public class Libro extends Base {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;


    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;


}
