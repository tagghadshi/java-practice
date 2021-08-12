package com.tcs.map.demo;

public class Students {
	long id;

	public Students(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + "]";
	}

}
