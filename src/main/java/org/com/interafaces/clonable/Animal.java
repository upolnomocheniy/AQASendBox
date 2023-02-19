package org.com.interafaces.clonable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal implements Cloneable {

    private String name;
    private String weight;
    private int id;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
