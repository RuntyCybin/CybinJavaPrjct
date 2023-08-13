package com.cybin.cybinOrg.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO implements Serializable {

    @NotNull(message = "username cannot be null")
    private String username;

    @Min(1)
    @Max(2)
    @NotNull(message = "role id cannot be null, 1 or 2")
    private Long roleId;

}
