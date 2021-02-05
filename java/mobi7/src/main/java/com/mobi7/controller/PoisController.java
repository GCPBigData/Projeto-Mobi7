package com.mobi7.controller;

import com.mobi7.dto.PoisDTO;
import com.mobi7.entity.Pois;
import com.mobi7.repository.PoisRepository;
import com.mobi7.service.PoiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("pois/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PoisController {

    @Autowired
    private PoiService poiService;

    @Autowired
    private PoisRepository poisRepository;

    @GetMapping(value="/todas", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Pois> listAll() {
        return poisRepository.findAll();
    }

    @RequestMapping(value="/buscarNome/{nome}", method= RequestMethod.GET)
    public ResponseEntity<List<PoisDTO>> getByNome(@PathVariable String nome) {
        Flux<Pois> listFlux = poisRepository.findAll();
        List<PoisDTO> listDto = listFlux.toStream()
                .sorted(Comparator.comparing(Pois::getId).reversed())
                .map(PoisDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
