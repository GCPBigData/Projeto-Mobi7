package com.mobi7.service;

import com.mobi7.entity.Pois;
import reactor.core.publisher.Flux;

/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */


public interface PoiService {

    Flux<Pois> findAll();
    Flux<Pois> searchNome(String nome);

}
