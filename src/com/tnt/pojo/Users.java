package com.tnt.pojo;

public class Users {
    private Integer user_id;
    private String user_phone;
    private String user_name;
    private String user_pass;
    private String user_address;

    public Integer getUid() {
        return user_id;
    }
    public void setUid(Integer uid) {
        this.user_id = uid;
    }

    public String getUtel() {
        return user_phone;
    }
    public void setUtel(String utel) {
        this.user_phone = utel == null ? null : utel.trim();
    }

    public String getUname() {
        return user_name;
    }
    public void setUname(String uname) {
        this.user_name = uname;
    }

    public String getUpwd() {
        return user_pass;
    }
    public void setUpwd(String upwd) {
        this.user_pass = upwd == null ? null : upwd.trim();
    }
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public Users(Integer user_id, String user_phone, String user_name, String user_pass, String user_address) {
		super();
		this.user_id = user_id;
		this.user_phone = user_phone;
		this.user_name = user_name;
		this.user_pass = user_pass;
		this.user_address = user_address;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
}






