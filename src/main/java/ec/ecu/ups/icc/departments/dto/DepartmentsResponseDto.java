package ec.ecu.ups.icc.departments.dto;

import ec.ecu.ups.icc.companies.entity.Company;

public class DepartmentsResponseDto {

    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private Company company;

    public DepartmentsResponseDto() {
    }

    public DepartmentsResponseDto(Long id, String name, Double budget, Character active, Company company) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.active = active;
        this.company = company;
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

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    
}
