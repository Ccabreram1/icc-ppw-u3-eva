package ec.ecu.ups.icc.companies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.ecu.ups.icc.companies.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
    
    
}
