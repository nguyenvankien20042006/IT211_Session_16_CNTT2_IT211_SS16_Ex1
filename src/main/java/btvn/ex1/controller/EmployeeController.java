package btvn.ex1.controller;

import btvn.ex1.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "Welcome HRM System";
    }

    @GetMapping("/api/v1/employees")
    public List<Employee> getEmployees() {

        return List.of(
                new Employee(
                        1L,
                        "Nguyễn Công Hưởng",
                        5000.0
                ),
                new Employee(
                        2L,
                        "Phạm Tuấn Bình",
                        5000.0
                ),
                new Employee(
                        3L,
                        "Nguyễn Văn A",
                        3000.0
                )
        );
    }
}