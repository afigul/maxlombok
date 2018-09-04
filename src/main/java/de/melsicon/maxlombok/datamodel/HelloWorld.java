package de.melsicon.maxlombok.datamodel;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorld {
    @Builder.Default
    private String name = "someName";
}
