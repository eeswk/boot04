package com.zerock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_pdsfiles")
@EqualsAndHashCode(of="fno")
public class PDSFile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long fno;
	
	private String pdsfile;
}
