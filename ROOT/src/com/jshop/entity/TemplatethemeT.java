package com.jshop.entity;

// Generated 2013-6-23 13:29:15 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TemplatethemeT generated by hbm2java
 */
@Entity
@Table(name = "templatetheme_t", catalog = "jshoper3")
public class TemplatethemeT implements java.io.Serializable {

	private String ttid;
	private String note;
	private String themename;
	private Date createtime;
	private String creatorid;
	private String sign;
	private String status;

	public TemplatethemeT() {
	}

	public TemplatethemeT(String ttid, String note, String themename,
			Date createtime, String creatorid, String sign, String status) {
		this.ttid = ttid;
		this.note = note;
		this.themename = themename;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.sign = sign;
		this.status = status;
	}

	@Id
	@Column(name = "TTID", unique = true, nullable = false, length = 20)
	public String getTtid() {
		return this.ttid;
	}

	public void setTtid(String ttid) {
		this.ttid = ttid;
	}

	@Column(name = "NOTE", nullable = false, length = 45)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "THEMENAME", nullable = false, length = 45)
	public String getThemename() {
		return this.themename;
	}

	public void setThemename(String themename) {
		this.themename = themename;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "SIGN", nullable = false, length = 100)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
