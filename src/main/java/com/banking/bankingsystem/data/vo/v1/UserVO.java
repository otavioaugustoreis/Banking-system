package com.banking.bankingsystem.data.vo.v1;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.banking.bankingsystem.entities.Count;


public class UserVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String cpf;
	private String telefone;
	private Date birthDate;
	
	
	Set<Count> count = new HashSet<>();
	
	public UserVO() {
		
	}
	public UserVO(Long id, String name, String email, String cpf, String telefone, Date birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", birthDate=" + birthDate + ", count=" + count + "]";
	}
	public Set<Count> getCount() {
		return count;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
