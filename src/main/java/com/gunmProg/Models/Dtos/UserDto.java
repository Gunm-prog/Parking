package com.gunmProg.Models.Dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserDto implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String vehicleType;
    private String licencePlate;
}
