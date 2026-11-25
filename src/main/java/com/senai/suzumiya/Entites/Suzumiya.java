package com.senai.suzumiya.Entites;

import com.senai.suzumiya.Entites.Enums.Genero;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
public class Suzumiya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @Positive
    private int idade;
    @CPF
    private String cpf;
    private Genero genero;
    @Past
    private LocalDate nasc;
    @Email
    private String email;

    public Suzumiya() {
    }

    public Suzumiya(int id, String name, int idade, String cpf, Genero genero, LocalDate nasc, String email) {
        this.id = id;
        this.name = name;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
        this.nasc = nasc;
        this.email = email;
    }

    public Suzumiya(String name, int idade, String cpf, Genero genero, LocalDate nasc, String email) {
        this.name = name;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
        this.nasc = nasc;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EntiySuzumiya{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", genero=" + genero +
                ", nasc=" + nasc +
                ", email='" + email + '\'' +
                '}';
    }
}