package com.begers.hrms.core.utilities.result;

import lombok.Data;

@Data
public class Result {

	private boolean success;
	private String message;

	public Result(boolean success) {
		this(success, null);
	}

	public Result(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
}
