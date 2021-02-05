package com.mobi7.repository;

import com.mobi7.entity.Pois;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */

public interface PoisRepository extends ReactiveCrudRepository<Pois, Long> {

    //Mono<Pois> findById(Long id);
    Flux<Pois> findByNome(String nome);

}
