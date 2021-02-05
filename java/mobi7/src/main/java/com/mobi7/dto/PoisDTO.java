package com.mobi7.dto;

import com.mobi7.entity.Pois;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PoisDTO {

    @Id
    long id;
    String nome;
    long raio;
    Double latitude;
    Double longitude;

    public PoisDTO(Pois pois) {
        id = pois.getId();
        nome = pois.getNome();
        raio = pois.getRaio();
        latitude = pois.getLatitude();
        longitude = pois.getLongitude();

    }

}
