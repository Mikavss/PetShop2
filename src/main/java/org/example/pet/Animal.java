package org.example.pet;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public abstract class Animal implements IVoice {
    protected final String name;
    protected int age;
    protected final double price;

    public abstract void voice(byte canFood);
}
