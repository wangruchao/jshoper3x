package com.jshop.entity;

// Generated 2014-9-29 15:34:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SystemMailT generated by hbm2java
 */
@Entity
@Table(name = "system_mail_t", catalog = "jshoper3")
public class SystemMailT implements java.io.Serializable {

	private String id;
	private String email;
	private String smtp;
	private String port;
	private String pwd;
	private String state;
	private String isdefault;
	private String isssl;
	private String creatorid;
	private Date createtime;
	private Date updatetime;
	private String creatorname;

	public SystemMailT() {
	}

	public SystemMailT(String id, String email, String smtp, String port,
			String pwd, String state, String isdefault, String isssl,
			String creatorid, Date createtime, Date updatetime,
			String creatorname) {
		this.id = id;
		this.email = email;
		this.smtp = smtp;
		this.port = port;
		this.pwd = pwd;
		this.state = state;
		this.isdefault = isdefault;
		this.isssl = isssl;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorname = creatorname;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "EMAIL", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "SMTP", nullable = false, length = 100)
	public String getSmtp() {
		return this.smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	@Column(name = "PORT", nullable = false, length = 45)
	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Column(name = "PWD", nullable = false, length = 100)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ISDEFAULT", nullable = false, length = 1)
	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	@Column(name = "ISSSL", nullable = false, length = 1)
	public String getIsssl() {
		return this.isssl;
	}

	public void setIsssl(String isssl) {
		this.isssl = isssl;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "CREATORNAME", nullable = false, length = 45)
	public String getCreatorname() {
		return this.creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}

}
