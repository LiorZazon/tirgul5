package com.company;

import lombok.ToString;

@ToString
public class MyClass2 {

    private String m_class_name;
    private  int m_student_in_class;

    public String getM_class_name() {
        return m_class_name;
    }
    public void setM_class_name (String class_name) {
        class_name = "kita 1";
    }
}
