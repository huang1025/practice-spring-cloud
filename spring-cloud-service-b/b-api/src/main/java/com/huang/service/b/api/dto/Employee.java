package com.huang.service.b.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Employee - employee
 *
 * @author: huang_jiangling
 * @date: 2019-06-21
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String name;

    private Integer age;
}
