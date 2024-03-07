package com.banking.bankingsystem.data.vo.v2;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.banking.bankingsystem.entities.Count;


public class UserVO2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String cpf;
	private String telefone;
	private Date birthDate;
	
	private String sexo;
	
	Set<Count> count = new HashSet<>();
	
	public UserVO2() {
		
	}
	public UserVO2(Long id, String name, String email, String cpf, String telefone, Date birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.birthDate = birthDate;
	}

	public String getRegister() {
		return sexo;
	}
	
	public void setRegister(String sexo) {
		this.sexo = sexo;
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
		return "UserVO2 [id=" + id + ", name=" + name + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", birthDate=" + birthDate + ", sexo=" + sexo + ", count=" + count + "]";
	}
	public Set<Count> getCount() {
		return count;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthDate, count, cpf, email, id, name, sexo, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO2 other = (UserVO2) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(count, other.count)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(sexo, other.sexo)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
	
}
