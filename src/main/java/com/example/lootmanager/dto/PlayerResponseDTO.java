package com.example.lootmanager.dto;

public class PlayerResponseDTO {

    private Long id;
    private String name;
    private String classe;
    private String spec;
    private int bisObtidos;
    private int bisTotal;
    private double progress;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public String getSpec() { return spec; }
    public void setSpec(String spec) { this.spec = spec; }

    public int getBisObtidos() { return bisObtidos; }
    public void setBisObtidos(int bisObtidos) { this.bisObtidos = bisObtidos; }

    public int getBisTotal() { return bisTotal; }
    public void setBisTotal(int bisTotal) { this.bisTotal = bisTotal; }

    public double getProgress() { return progress; }
    public void setProgress(double progress) { this.progress = progress; }
}
