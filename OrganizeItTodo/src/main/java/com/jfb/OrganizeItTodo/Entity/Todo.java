package com.jfb.OrganizeItTodo.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @NotNull
    private Integer id;
    @NotBlank
    private String title;

    private Date date;
    @NotNull
    private boolean status;

}
