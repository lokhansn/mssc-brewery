package com.sgl.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    UUID id;

    @NotBlank
    @Size(min = 3, max = 100, message = "Value of name should be between 3 and 100")
    String name;
}
