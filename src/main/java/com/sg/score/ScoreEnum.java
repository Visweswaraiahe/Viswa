package com.sg.score;

/**
 * 
 */
public enum ScoreEnum {

	UN(15), 
	DEUX(30), 
	TROIS(40);

	private Integer value;

	ScoreEnum(Integer envUrl) {
		this.value = envUrl;
	}

	public Integer getValue() {
		return value;
	}
}
