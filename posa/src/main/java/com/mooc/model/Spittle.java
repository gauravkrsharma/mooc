package com.mooc.model;

import java.util.Date;

public class Spittle {

	private final Long id;
	private final String message;
	private final Date time;
	private Double latitute;
	private Double longitude;
	
	public Spittle(long id, String message, Date time){
		this(id,message,time,null,null);
	}

	public Spittle(long id,String message, Date time, Double latitute, Double longitude) {
		this.id = id;
		this.message = message;
		this.time = time;
		this.latitute = latitute;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public Double getLatitute() {
		return latitute;
	}

	public Double getLongitude() {
		return longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spittle other = (Spittle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
	
}
