package com.controllers.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class StandardError implements Serializable {
    Long timestamp;
    Integer status;
    String  error;
    String message;
    String path;
}
