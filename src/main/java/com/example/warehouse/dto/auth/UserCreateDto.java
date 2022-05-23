package com.example.warehouse.dto.auth;

import com.example.warehouse.dto.BaseDto;
import com.example.warehouse.enums.AuthGender;
import com.example.warehouse.enums.AuthRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;

@Getter
@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto implements BaseDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String firstName;

    private String lastName;

    // @Pattern(regexp = "") TODO Write regex for phone number
    private String phone;

    private boolean superAdmin;

    private AuthGender gender;

    private AuthRole role;

    @NotBlank
    private String organizationId;

}