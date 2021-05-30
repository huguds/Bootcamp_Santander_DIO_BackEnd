package com.project.bootcamp.exceptions;

public class BusinessException extends RuntimeException{ // É uma classe para excessão

    public BusinessException(String message){ // Cria um construtor
        super(message); // Propaga a mensagem que está sendo passada para ele
    }
}
