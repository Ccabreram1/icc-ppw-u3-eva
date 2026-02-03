package ec.ecu.ups.icc.companies.dto;

import ec.ecu.ups.icc.departments.entity.Department;

public class CompaniesResponseDto {

    private Long id;
    private String name;
    private String country;
    private Character active;
    private Department department;
    
    public CompaniesResponseDto() {
    }

    public CompaniesResponseDto(Long id, String name, String country, Character active, Department department) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.active = active;
        this.department = department;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
 
    
}
