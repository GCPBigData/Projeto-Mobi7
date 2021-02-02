package com.mobi7.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

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
@Table("pois")
public class Pois implements Serializable {

	private static final long serialVersionUID = 9142959708191247040L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pois_id_seq")
	@Column(name = "id")
	private long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "raio")
	private long raio;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;

}
