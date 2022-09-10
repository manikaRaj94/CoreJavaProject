package com.javaproject.coding.String;

import java.util.Date;
import java.util.HashMap;

public final class ImmutableClass {


    private final Integer id; //Immutable member variable
    private final String name; //Immutable member variable


    public ImmutableClass(Integer id, String name){
        this.id=id;
        this.name=name;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
