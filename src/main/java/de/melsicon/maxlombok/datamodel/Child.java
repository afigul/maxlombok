package de.melsicon.maxlombok.datamodel;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=true)
public class Child extends Ancestor {
    private int someNumber;

    @Builder
    public Child(String name, String surname, int someNumber) {
        super(name, surname);
        this.someNumber = someNumber;
    }
}
