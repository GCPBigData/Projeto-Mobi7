package com.mobi7.service.impl;

import com.mobi7.entity.Pois;
import com.mobi7.repository.PoisRepository;
import com.mobi7.service.PoiService;
import io.netty.util.internal.StringUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class PoisServiceImplements implements PoiService {

    @Autowired
    PoisRepository poisRepository;

    @Override
    public Flux<Pois> findAll() {
        return poisRepository.findAll()
                .switchIfEmpty(monoResponseStatusNotFoundException()); }

    public Flux<Pois> searchNome(String nome) { return poisRepository.findByNome(nome); }

/*    private void throwResponseStatusExceptionWhenEmptyName(Pois pois){
        if(StringUtil.isNullOrEmpty(Pois.getNome())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid Name");
        }
    }*/

    public <T> Mono<T> monoResponseStatusNotFoundException() {
        return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Pois not found"));
    }
}
