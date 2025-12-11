package com.Spring.Boot.MVC.and.RESTful.APIs.module2.dto;

import com.Spring.Boot.MVC.and.RESTful.APIs.module2.annotations.EmployeeRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
//    private Long id;
//    private String name;
//    private String email;
//    private Integer age;
//    private LocalDate dateOfJoining;
//
//    @JsonProperty("isActive")
//    private Boolean isActive;



//    input Validation Annotations, Creating Custom Annotation for Validation (2.6)


    private Long id;
//    @NotNull(message = "Required field in Employee: name")
//    private String name;

//    @NotEmpty(message = "Name of the employee cannot be empty")
//    private String name;

    @NotBlank(message = "Name of the employee cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters in name should be in range: [3, 10]")
    private String name;

    @Email(message = "Email should be valid email")
    private String email;


    @Max(value = 80, message = "Age of Employee cannot be greater then 80")
    @Min(value = 18, message = "Age of Employee cannot be less then 18")
    private Integer age;

    @PastOrPresent(message = "DateOfJoin field in Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;

    @NotBlank(message = "Role of the employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role of Employee can be USER or ADMin")
    @EmployeeRoleValidation
    private String role; //ADMIN, UDER

    @NotNull(message = "Salary of employee should not be null")
    @Positive(message = "salary of Employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in form XXXXX.YY")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

}
