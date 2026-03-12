package com.educacion.recursos.modelo;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Entity
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 1. CATEQUIZANDO
    private String nombre;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
    private Integer edad;
    private String direccion;
    private String viveCon;
    private String hijos;
    private String ocupacion;
    private String lugarTrabajo;
    private String telefono;

    private boolean bautismo;
    private boolean eucaristia;
    private boolean reconciliacion;

    // 2. PADRES
    private String nombrePapa;
    private String telPapa;
    private String nombreMama;
    private String telMama;

    // 3. EMERGENCIA
    private String nombreEmergencia;
    private String telEmergencia;
    private String relacionEmergencia;

    // 4. CATEQUESIS
    private String catequista;
    private String diaCatequesis;
    private String horaCatequesis;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicioCatequesis;

    // --- NUEVO CAMPO PARA EL FILTRO DE FECHA ---
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;

    // Esta función asegura que la fecha se ponga sola al guardar
    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDate.now();
    }

    // --- GETTERS Y SETTERS COMPLETOS (TODOS) ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getViveCon() { return viveCon; }
    public void setViveCon(String viveCon) { this.viveCon = viveCon; }

    public String getHijos() { return hijos; }
    public void setHijos(String hijos) { this.hijos = hijos; }

    public String getOcupacion() { return ocupacion; }
    public void setOcupacion(String ocupacion) { this.ocupacion = ocupacion; }

    public String getLugarTrabajo() { return lugarTrabajo; }
    public void setLugarTrabajo(String lugarTrabajo) { this.lugarTrabajo = lugarTrabajo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public boolean isBautismo() { return bautismo; }
    public void setBautismo(boolean bautismo) { this.bautismo = bautismo; }

    public boolean isEucaristia() { return eucaristia; }
    public void setEucaristia(boolean eucaristia) { this.eucaristia = eucaristia; }

    public boolean isReconciliacion() { return reconciliacion; }
    public void setReconciliacion(boolean reconciliacion) { this.reconciliacion = reconciliacion; }

    public String getNombrePapa() { return nombrePapa; }
    public void setNombrePapa(String nombrePapa) { this.nombrePapa = nombrePapa; }

    public String getTelPapa() { return telPapa; }
    public void setTelPapa(String telPapa) { this.telPapa = telPapa; }

    public String getNombreMama() { return nombreMama; }
    public void setNombreMama(String nombreMama) { this.nombreMama = nombreMama; }

    public String getTelMama() { return telMama; }
    public void setTelMama(String telMama) { this.telMama = telMama; }

    public String getNombreEmergencia() { return nombreEmergencia; }
    public void setNombreEmergencia(String nombreEmergencia) { this.nombreEmergencia = nombreEmergencia; }

    public String getTelEmergencia() { return telEmergencia; }
    public void setTelEmergencia(String telEmergencia) { this.telEmergencia = telEmergencia; }

    public String getRelacionEmergencia() { return relacionEmergencia; }
    public void setRelacionEmergencia(String relacionEmergencia) { this.relacionEmergencia = relacionEmergencia; }

    public String getCatequista() { return catequista; }
    public void setCatequista(String catequista) { this.catequista = catequista; }

    public String getDiaCatequesis() { return diaCatequesis; }
    public void setDiaCatequesis(String diaCatequesis) { this.diaCatequesis = diaCatequesis; }

    public String getHoraCatequesis() { return horaCatequesis; }
    public void setHoraCatequesis(String horaCatequesis) { this.horaCatequesis = horaCatequesis; }

    public LocalDate getInicioCatequesis() { return inicioCatequesis; }
    public void setInicioCatequesis(LocalDate inicioCatequesis) { this.inicioCatequesis = inicioCatequesis; }

    // Getter y Setter del nuevo campo de registro
    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}