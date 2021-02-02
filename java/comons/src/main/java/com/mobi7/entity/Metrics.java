package com.mobi7.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table("metrics")
public class Metrics {

	private static final long serialVersionUID = 1;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "metrics_id_seq")
	private long id;
	@Column(name = "placa")
	private String placa;
	@Column(name = "dataposicao")
	private Date dataPosicao;
	@Column(name = "datahoraposicao")
	private String dtHoraPosicao;
	@Column(name = "velocidade")
	private Integer velocidade;
	@Column(name = "IGNICAO")
	private Boolean ignicao;
	@Column(name = "nomeponto")
	private String nomePonto;
	@Column(name = "raiolimite")
	private long raioLimite;
	@Column(name = "raioreal")
	private Integer raioReal;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;

}
