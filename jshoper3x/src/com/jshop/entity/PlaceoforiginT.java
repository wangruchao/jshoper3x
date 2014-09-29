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
 * PlaceoforiginT generated by hbm2java
 */
@Entity
@Table(name = "placeoforigin_t", catalog = "jshoper3")
public class PlaceoforiginT implements java.io.Serializable {

	private String placeid;
	private String placename;
	private String creatorid;
	private Date createtime;
	private String parentId;
	private String grade;
	private int sort;
	private String parentName;
	private Date updatetime;
	private int versiont;

	public PlaceoforiginT() {
	}

	public PlaceoforiginT(String placeid, String placename, String creatorid,
			Date createtime, String parentId, String grade, int sort,
			String parentName, Date updatetime, int versiont) {
		this.placeid = placeid;
		this.placename = placename;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.parentId = parentId;
		this.grade = grade;
		this.sort = sort;
		this.parentName = parentName;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "PLACEID", unique = true, nullable = false, length = 20)
	public String getPlaceid() {
		return this.placeid;
	}

	public void setPlaceid(String placeid) {
		this.placeid = placeid;
	}

	@Column(name = "PLACENAME", nullable = false, length = 50)
	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
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

	@Column(name = "PARENT_ID", nullable = false, length = 20)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "GRADE", nullable = false, length = 1)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "SORT", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "PARENT_NAME", nullable = false, length = 45)
	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
