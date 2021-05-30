// Classe para interagir com o controlador
package com.project.bootcamp.Model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class StockDTO { // DTO é a interação com o compilador (data transfer object)
    // Dados principais que serão aprensentados em tela
    private Long id; // Identificação

    @NotNull // Definir para que não poder ser nulo
    private String name; // Nome da ação

    @NotNull
    @DecimalMin(value = "0.00") // Definir o valor minimo
    @Digits(integer = 6, fraction = 2) // Definir a quantidade de digitos
    private Double price; // Preço da determinada ação

    @NotNull
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY") // Converte os dados para o fomato String
    private LocalDate date; // Data da ação

    @NotNull
    @Digits(integer = 3, fraction = 2) // Definir a quantidade de digitos
    private Double variation; // variação da ação

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }
}
