package ec.ecu.ups.icc.departments.dto;

import java.util.List;

import ec.ecu.ups.icc.companies.entity.Company;
import ec.ecu.ups.icc.employees.entity.Employee;

public class DepartmentWithEmployeesDto {

    private Long id;
    private String name;
    private Double budget;
    private Company company;
    private List<Employee> employees;
    private Integer employeeCount;
    private Double totalSalaries;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Double getTotalSalaries() {
        return totalSalaries;
    }

    public void setTotalSalaries(Double totalSalaries) {
        this.totalSalaries = totalSalaries;
    }

}
