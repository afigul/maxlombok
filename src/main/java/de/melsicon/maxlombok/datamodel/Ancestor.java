package de.melsicon.maxlombok.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ancestor {
    private String name;
    private String surname;
}
