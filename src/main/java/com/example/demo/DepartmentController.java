package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:5500")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    public static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    //Todo
    @PostMapping("addDept")
    public ResponseEntity<CommonResponse<?>> addDept(@RequestBody Department department){
        if(departmentRepository.findByDeptName(department.getDeptName()).isPresent()){

        }
)
        Department newDepartment = new Department();
        newDepartment.setDeptName(department.getDeptName());
        newDepartment.setLoc(department.getLoc());
        departmentRepository.save(newDepartment);


    }
    //Todo
    private ResponseEntity<CommonResponse<?>> generateResponse(StatusCode statusCode, Integer deptId){
    }

    private String convertStatusToMessage(StatusCode statusCode){
        switch(statusCode){
            case OK:
                return "success";
            case InvalidData:
                return "Invalid_input";
            case InternalError:
                return "Internal_error";
            case AccountUnavailable:
                return "Duplicate";
            default:
                log.warn("unknown_status:{}",statusCode);
                return "Unknown_status";
        }
    }
}
