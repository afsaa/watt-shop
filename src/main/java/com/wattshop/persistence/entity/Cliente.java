package com.wattshop.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Double celular;

    private String direccion;

    private String correo_electronico;
}
