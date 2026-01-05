package com.fragansias.company.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable

public class DetalleProducto implements Serializable {

    private String descripcion;

    @Temporal(TemporalType.DATE)
    private Date fechaCreacion ;

    private String tipoFrasco;



}
