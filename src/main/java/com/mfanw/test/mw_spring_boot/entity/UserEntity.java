package com.mfanw.test.mw_spring_boot.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("sys_user")
public class UserEntity extends BaseEntity {

	private static final long serialVersionUID = -3878972194874311454L;

	@TableField
	private String username;

	@TableField
	private String password;

	@TableField
	private String nikename;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

}
