package service;

import entity.Department;
import repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Inside save department: DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId)
    {
        log.info("Inside find department: DepartmentService");
        return  departmentRepository.findByDepartmenId(departmentId);
    }
}
