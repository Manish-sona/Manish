package com.crm.crm.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;


@Data
public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(min = 3, message = "At least 3 chars required")
    private String name;

    @Email
    private String emailId;

    @Size(min =10,max =10, message = "should be 10 digits")
    private String mobile;


}
