package cn.net.jalo.framework.commons.model;

public class Result<T> {

	private Boolean isEmpty;
	
	private T item;
	
	private String message;
	
	private Boolean success;
	
	protected Result() {}
	
	public Result(T item) {
		this.isEmpty = item == null ? true : false;
		this.item = item;
		this.message = null;
		this.success = true;
	}
	
	public Result(Boolean success, Boolean isEmpty, String message) {
		this.isEmpty = isEmpty;
		this.item = null;
		this.message = message;
		this.success = success;
	}
	
	public Result(String errorMessage) {
		this.isEmpty = true;
		this.item = null;
		this.message = errorMessage;
		this.success = false;
	}
	
	public Result(Exception e) {
		this.isEmpty = true;
		this.item = null;
		this.message = e.getMessage();
		this.success = false;
	}

	public Boolean getIsEmpty() {
		return isEmpty;
	}
	
	public T getItem() {
		return item;
	}

	public String getMessage() {
		return message;
	}

	public Boolean getSuccess() {
		return success;
	}

}
