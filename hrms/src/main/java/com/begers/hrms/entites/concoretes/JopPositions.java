package com.begers.hrms.entites.concoretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Jop_Positions")
public class JopPositions {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="JopName")
	private String JopName;

	@Column(name="PositionId")
	private int PositionId;

	public JopPositions(int id, String jopName, int positionId) {
		super();
		this.id = id;
		JopName = jopName;
		PositionId = positionId;
	}

	
	
}
