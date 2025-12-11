package com.Spring.Boot.MVC.and.RESTful.APIs.module2.controllers;

import com.Spring.Boot.MVC.and.RESTful.APIs.module2.dto.EmployeeDTO;
import com.Spring.Boot.MVC.and.RESTful.APIs.module2.entities.EmployeeEntity;
import com.Spring.Boot.MVC.and.RESTful.APIs.module2.exceptions.ResourceNotFoundException;
import com.Spring.Boot.MVC.and.RESTful.APIs.module2.repositories.EmployeeRepository;
import com.Spring.Boot.MVC.and.RESTful.APIs.module2.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


//    this is the code of Presentation layer {module2(2.2)}

//    @GetMapping(path = "/getSecretMessage")
//    public String getSecretMessage(){
//        return "Secret Message: asdsf23jkl;";
//    }

//    @GetMapping("/employees/{employeeId}")
//    public EmployeeDTO gatEmployeeById(@PathVariable Long employeeId){
//        return new EmployeeDTO(employeeId, "Gautam", "gautam@gmail.com", 34, LocalDate.of(20225, 12,8), true);
//    }



//    @GetMapping(path = "/{employeeId}")
//    public EmployeeDTO gatEmployeeById(@PathVariable(name = "employeeId") Long id){
//        return new EmployeeDTO(id, "Gautam", "gautam@gmail.com", 34, LocalDate.of(20225, 12,8), true);
//    }

//    @GetMapping(path = "/employees")
//    @GetMapping
//    public String getAllEmployees(@RequestParam(required = false) Integer age,
//                                  @RequestParam(required = false) String sortBy){
//        return "Hi age "+age+" "+sortBy;
//    }


//    @PostMapping
//    public String createNewEmployee(){
//        return "Hello from the POST";
//    }


//@PostMapping
//public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
//    inputEmployee.setId(100L);
//    return inputEmployee;
//}

//    @PutMapping
//    public String updateEmployeeById(){
//        return "Hello from put";
//    }



//    this is the code of persistence layer {module2(2.3)}

//    private final EmployeeRepository employeeRepository;
//    public EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

//    @GetMapping(path = "/{employeeId}")
//    public EmployeeEntity gatEmployeeById(@PathVariable(name = "employeeId") Long id){
//        return employeeRepository.findById(id).orElse(null);
//    }

//    @GetMapping
//    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
//                                                @RequestParam(required = false) String sortBy){
//        return employeeRepository.findAll();
//    }

//    @PostMapping
//    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee){
//       return employeeRepository.save(inputEmployee);
//    }

//    @PutMapping
//    public String updateEmployeeById(){
//        return "Hello from put";
//    }


//    this is the code of service layer {module 2(2.4)}


//    private final EmployeeService employeeService;
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

//    @GetMapping(path = "/{employeeId}")
//    public EmployeeDTO gatEmployeeById(@PathVariable(name = "employeeId") Long id){
//        return employeeService.getEmployeeById(id);
//    }

//    @GetMapping
//    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
//                                                @RequestParam(required = false) String sortBy){
//        return employeeService.getAllEmployees();
//    }

//    @PostMapping
//    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
//        return employeeService.createNewEmployee(inputEmployee);
//    }

//    @PutMapping
//    public String updateEmployeeById(){
//        return "Hello from put";
//    }




//    PUT, PATCH and DELETE Mapping in Spring Web MVC {module2(2.5)}



//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO>gatAllEmployee(@PathVariable(name = "employeeId") Long id){
//        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
//        return employeeDTO
//                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @GetMapping
//    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
//                                             @RequestParam(required = false) String sortBy){
//        return ResponseEntity.ok(employeeService.getAllEmployees());
//    }
//
//    @PostMapping
//    public ResponseEntity<EmployeeDTO> createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
//        EmployeeDTO savedEmployee = employeeService.createNewEmployee(inputEmployee);
//        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
//    }
//
//    @PutMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO> updateEmployeeById(@RequestBody EmployeeDTO employeeDTO, @PathVariable Long employeeId){
//        return ResponseEntity.ok(employeeService.updateEmployeeById(employeeId, employeeDTO));
//    }
//
//    @DeleteMapping(path = "/{employeeId}")
//    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long employeeId){
//       return ResponseEntity.ok(employeeService.deleteEmployeeById(employeeId)); // or we can also return like this
//        boolean gotDeleted = employeeService.deleteEmployeeById(employeeId);
//        if (gotDeleted) return ResponseEntity.ok(true);
//        return ResponseEntity.notFound().build();
//    }
//
//    @PatchMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@RequestBody Map<String, Object> updates,
//                                                 @PathVariable Long employeeId){
//        EmployeeDTO employeeDTO = employeeService.updatePartialEmployeeById(employeeId, updates);
//        return ResponseEntity.ok(employeeDTO);
//    }



//    input Validation Annotations, Creating Custom Annotation for Validation (2.6)


//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO>gatAllEmployee(@PathVariable(name = "employeeId") Long id){
//        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
//        return employeeDTO
//                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
//    }
//
//
//    @GetMapping
//    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
//                                                             @RequestParam(required = false) String sortBy){
//        return ResponseEntity.ok(employeeService.getAllEmployees());
//    }
//
//    @PostMapping
//    public ResponseEntity<EmployeeDTO> createNewEmployee(@RequestBody @Valid EmployeeDTO inputEmployee){
//        EmployeeDTO savedEmployee = employeeService.createNewEmployee(inputEmployee);
//        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
//    }
//
//    @PutMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO> updateEmployeeById(@RequestBody EmployeeDTO employeeDTO, @PathVariable Long employeeId){
//        return ResponseEntity.ok(employeeService.updateEmployeeById(employeeId, employeeDTO));
//    }
//
//    @DeleteMapping(path = "/{employeeId}")
//    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long employeeId){
////       return ResponseEntity.ok(employeeService.deleteEmployeeById(employeeId)); // or we can also return like this
//        boolean gotDeleted = employeeService.deleteEmployeeById(employeeId);
//        if (gotDeleted) return ResponseEntity.ok(true);
//        return ResponseEntity.notFound().build();
//    }
//
//    @PatchMapping(path = "/{employeeId}")
//    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@RequestBody Map<String, Object> updates,
//                                                                 @PathVariable Long employeeId){
//        EmployeeDTO employeeDTO = employeeService.updatePartialEmployeeById(employeeId, updates);
//        return ResponseEntity.ok(employeeDTO);
//    }



//    Exception Handling

private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
        return employeeDTO
                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: "+id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                                             @RequestParam(required = false) String sortBy) {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createNewEmployee(@RequestBody @Valid EmployeeDTO inputEmployee) {
        EmployeeDTO savedEmployee = employeeService.createNewEmployee(inputEmployee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


    @PutMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployeeById(@RequestBody @Valid EmployeeDTO employeeDTO, @PathVariable Long employeeId) {
        return ResponseEntity.ok(employeeService.updateEmployeeById(employeeId, employeeDTO));
    }

    @DeleteMapping(path = "/{employeeId}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long employeeId) {
        boolean gotDeleted = employeeService.deleteEmployeeById(employeeId);
        if (gotDeleted) return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PatchMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@RequestBody Map<String, Object> updates,
                                                                 @PathVariable Long employeeId) {
        EmployeeDTO employeeDTO = employeeService.updatePartialEmployeeById(employeeId, updates);
        if (employeeDTO == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(employeeDTO);
    }

}
