package com.horvan.trial.entity;

import com.horvan.trial.Constant;

import javax.persistence.*;

/**
 * The type User.
 */
@Entity(name = Constant.TABLE_USER)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //管理员ID
    private long id;

    //管理员登录名
    private String username;

    //登录密码
    private String password;

    //是否可用
    private boolean enabled = true;

    //真实姓名
    private String realname;

    //手机号
    private String mobile;

    private int role;
    //所属部门
    private String position;

    public User() {
    }

    public User(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Is enabled boolean.
     *
     * @return the boolean
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     *
     * @param enabled the enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Gets realname.
     *
     * @return the realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * Sets realname.
     *
     * @param realname the realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public int getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(int role) {
        this.role = role;
    }

    /**
     * Gets position.
     * 所属部门
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
