package concessionaire.api.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Role role;

    @Column(name = "nombre", length = 50, nullable = false)
    private String firstName;

    @Column(name = "apellido", length = 50, nullable = false)
    private String lastName;

    @Column(name = "correo", length = 50, nullable = false)
    private String email;

    @Column(name = "telefono", length = 50, nullable = false)
    private String phone;

    @Column(name = "direccion", length = 50, nullable = false)
    private String address;

    @Column(name = "fecha_nacimiento", length = 50, nullable = false)
    private Date dob;
}
