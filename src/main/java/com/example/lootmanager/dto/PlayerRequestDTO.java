package com.example.lootmanager.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PlayerRequestDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Classe é obrigatória")
    private String classe;

    @NotBlank(message = "Spec é obrigatória")
    private String spec;

    @NotNull(message = "bisObtidos é obrigatório")
    @Min(value = 0, message = "bisObtidos não pode ser negativo")
    private Integer bisObtidos;

    @NotNull(message = "bisTotal é obrigatório")
    @Min(value = 1, message = "bisTotal deve ser no mínimo 1")
    private Integer bisTotal;

    // getters e setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public String getSpec() { return spec; }
    public void setSpec(String spec) { this.spec = spec; }

    public Integer getBisObtidos() { return bisObtidos; }
    public void setBisObtidos(Integer bisObtidos) { this.bisObtidos = bisObtidos; }

    public Integer getBisTotal() { return bisTotal; }
    public void setBisTotal(Integer bisTotal) { this.bisTotal = bisTotal; }
}
