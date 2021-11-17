package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    public Application createMock() {
        return new Application("Mikolaj", "Zimkowski", "email@gmail.com"); // new allowed here
    }
}
