package com.pescar.donarvida.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "donaciones")
public class Donaciones implements Serializable {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donaciones")
    private Long id;
    
	@Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "celular")
    private String celular;

    @Column(name = "tipo_sangre")
    private String tipoSangre;

    public Donaciones() {}

    public Donaciones (Long id, String nombre, String apellido, Integer edad, String localidad, String celular, String tipoSangre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
        this.celular = celular;
        this.tipoSangre = tipoSangre;
    }
    
    public Donaciones (String nombre, String apellido, Integer edad, String localidad, String celular, String tipoSangre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
        this.celular = celular;
        this.tipoSangre = tipoSangre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCelular() {
        return celular;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((edad == null) ? 0 : edad.hashCode());
        result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
        result = prime * result + ((celular == null) ? 0 : celular.hashCode());
        result = prime * result + ((tipoSangre == null) ? 0 : tipoSangre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Donaciones other = (Donaciones) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad == null) {
            if (other.edad != null)
                return false;
        } else if (!edad.equals(other.edad))
            return false;
        if (localidad == null) {
            if (other.localidad != null)
                return false;
        } else if (!localidad.equals(other.localidad))
            return false;
        if (celular == null) {
            if (other.celular != null)
                return false;
        } else if (!celular.equals(other.celular))
            return false;
        if (tipoSangre == null) {
            if (other.tipoSangre != null)
                return false;
        } else if (!tipoSangre.equals(other.tipoSangre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Donaciones [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", localidad=" + localidad + ", celular=" + celular + ", tipoSangre=" + tipoSangre + "]";
    }

}
