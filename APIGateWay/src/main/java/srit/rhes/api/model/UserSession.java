package srit.rhes.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_session")
public class UserSession implements Serializable{
	
	private static final long serialVersionUID = -5053305123274840945L;
	@Id
	@Column(name ="SESSION_ID" )
	protected String sessionId;
	@Column(name ="CREATION_TIME" )
	protected int creationTime;
	@Column(name ="LAST_ACCESS_TIME")
	protected int lastAccessTime;
	@Column(name ="MAX_INACTIVE_INTERVAL" )
	protected int maxInactiveInterval;
	@Column(name ="EXPIRY_TIME" )
	protected int expiryTime;
	@Column(name ="PRINCIPAL_NAME" )
	protected String principleName;
	
	
	public UserSession() {
	}


	public UserSession(String sessionId, int creationTime, int lastAccessTime, int maxInactiveInterval, int expiryTime,
			String principleName) {
		this.sessionId = sessionId;
		this.creationTime = creationTime;
		this.lastAccessTime = lastAccessTime;
		this.maxInactiveInterval = maxInactiveInterval;
		this.expiryTime = expiryTime;
		this.principleName = principleName;
	}


	public String getSessionId() {
		return sessionId;
	}


	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	public int getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}


	public int getLastAccessTime() {
		return lastAccessTime;
	}


	public void setLastAccessTime(int lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}


	public int getMaxInactiveInterval() {
		return maxInactiveInterval;
	}


	public void setMaxInactiveInterval(int maxInactiveInterval) {
		this.maxInactiveInterval = maxInactiveInterval;
	}


	public int getExpiryTime() {
		return expiryTime;
	}


	public void setExpiryTime(int expiryTime) {
		this.expiryTime = expiryTime;
	}


	public String getPrincipleName() {
		return principleName;
	}


	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
	}


	@Override
	public String toString() {
		return "UserSession [sessionId=" + sessionId + ", creationTime=" + creationTime + ", lastAccessTime="
				+ lastAccessTime + ", maxInactiveInterval=" + maxInactiveInterval + ", expiryTime=" + expiryTime
				+ ", principleName=" + principleName + "]";
	}

}