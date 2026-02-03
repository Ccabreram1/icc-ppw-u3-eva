package ec.ecu.ups.icc.departments.mapper;

import ec.ecu.ups.icc.departments.dto.DepartmentsResponseDto;
import ec.ecu.ups.icc.departments.entity.Department;

public class DepartmentMapper {
    
    private DepartmentMapper() {

    }

    public static DepartmentsResponseDto toResponseDto(Department department) {
        return new DepartmentsResponseDto(
                department.getId(),
                department.getName(),
                department.getBudget(),
                department.getActive(),
                department.getCompany());
    }
}
