package com.mobi7.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;


/*
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * @since Santiago Chile 02/02/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("positions")
public class Positions implements Serializable {

	private static final long serialVersionUID = -813787027401588713L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "positions_id_seq")
	private long id;
	@Column(name = "placa")
	private String placa;
	@Column(name = "dataposicao")
	private Date dataPosicao;
	@Column(name = "velocidade")
	private Integer velocidade;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	@Column(name = "ignicao")
	private Boolean ignicao;

}
