package com.zerock.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude="board")
@Entity
@Table(name="tbl_free_replies", indexes= {@Index(unique=false, columnList="board_bno")})
@EqualsAndHashCode(of="rno")
public class FreeBoardReply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rno;
	private String reply;
	private String relyer;
	
	@CreationTimestamp
	private Timestamp replydate;
	
	@CreationTimestamp
	private Timestamp updatedate;
	
	@ManyToOne
	private FreeBoard board;
}
