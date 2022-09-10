package com.javaproject.coding.collectionProgram.mapPrograms.objectKeyCreation;

import java.util.Date;
import java.util.LinkedHashMap;

public class ObjectKeyCreationMain {
    public static void main(String[] args) {

        LinkedHashMap<Employee, Date> employeeDateTreeMap = new LinkedHashMap<>();
        employeeDateTreeMap = OperationOnEmployee.addEmployee();
        OperationOnEmployee.getAllEmployees(employeeDateTreeMap);

    }
}
