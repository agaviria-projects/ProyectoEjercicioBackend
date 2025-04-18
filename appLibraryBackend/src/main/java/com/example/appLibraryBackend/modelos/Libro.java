package com.example.appLibraryBackend.modelos;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/*@Data       //usar anotaciones de lombok
@NoArgsConstructor  //Constructor vacio
@AllArgsConstructor //constructor con todos los atributos
@Setter
@Getter*/
@Entity //Definir esta clase como una entidad (tabla)
//@Table(name = "tbllibro")
public class Libro {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idbook", nullable = false,length = 20, unique = true)
    @Column(length = 20)
    private Long id;
    @Column(nullable=false,length = 30)
    private String name;


    //Relacion o asociacion de que un libro puede tener varios prestamos
    @OneToMany(mappedBy = "libro")
    @JsonManagedReference(value = "libro-prestamos")
    private List<Prestamo> prestamos;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    @JsonBackReference
    private Categoria categoria;

    //constructores clic derecho generate
    public Libro(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter y setter clic derecho Generate
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public Libro() {
    }

}
