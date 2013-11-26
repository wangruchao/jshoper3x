package com.jshop.entity;

// Generated 2013-11-26 21:02:17 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * ActIdGroup generated by hbm2java
 */
@Entity
@Table(name = "act_id_group", catalog = "jshoper3")
public class ActIdGroup implements java.io.Serializable {

	private String id;
	private Integer rev;
	private String name;
	private String type;
	private Set<ActIdUser> actIdUsers = new HashSet<ActIdUser>(0);

	public ActIdGroup() {
	}

	public ActIdGroup(String id) {
		this.id = id;
	}

	public ActIdGroup(String id, Integer rev, String name, String type,
			Set<ActIdUser> actIdUsers) {
		this.id = id;
		this.rev = rev;
		this.name = name;
		this.type = type;
		this.actIdUsers = actIdUsers;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TYPE_")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "act_id_membership", catalog = "jshoper3", joinColumns = { @JoinColumn(name = "GROUP_ID_", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "USER_ID_", nullable = false, updatable = false) })
	public Set<ActIdUser> getActIdUsers() {
		return this.actIdUsers;
	}

	public void setActIdUsers(Set<ActIdUser> actIdUsers) {
		this.actIdUsers = actIdUsers;
	}

}
