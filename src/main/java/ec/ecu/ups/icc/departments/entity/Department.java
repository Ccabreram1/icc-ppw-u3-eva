package ec.ecu.ups.icc.departments.entity;

import ec.ecu.ups.icc.companies.entity.Company;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private Company company;

    // private List<employees> employees
    public Department() {
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

    public void setActive(Character acrtive) {
        this.active = acrtive;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
