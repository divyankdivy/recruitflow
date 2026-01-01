package com.jobportal.recruitflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Column(nullable = false)
    private String roleName;

//    Constructor
    public Role() {}

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

//    Getters and Setters
    public int getRoleId() {return this.roleId;}

    public void setRoleId(int roleId) {this.roleId = roleId;}

    public String getRoleName() {return this.roleName;}

    public void setRoleName(String roleName) {this.roleName = roleName;}

}
