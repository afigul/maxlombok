package de.melsicon.maxlombok.Service;

import org.springframework.stereotype.Service;

@Service
public class ToUpperCaseService {
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}
