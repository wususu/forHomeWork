package com.compro.model;

import java.io.Serializable;

public class ResponseModel implements Serializable{
	
	private int code;
	
	private String msg;
	
	private Object content;

	public static ResponseModel SUCCESS(Object obj){
		return new ResponseModel(200, "O(∩_∩)O~~", obj);
	}
	
	public static ResponseModel ERROR(Object obj){
		return new ResponseModel(400, "error", obj);
	}
	
	public ResponseModel(int code, String msg, Object content) {
		super();
		this.code = code;
		this.msg = msg;
		this.content = content;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
