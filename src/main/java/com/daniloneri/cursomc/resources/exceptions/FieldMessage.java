package com.daniloneri.cursomc.resources.exceptions;

public class FieldMessage {
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String message;

	public FieldMessage() {
		super();
	}

	public FieldMessage(String fielName, String message) {
		super();
		this.fieldName = fielName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldMessage(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
