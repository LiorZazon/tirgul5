package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class FamilyDoctor {

    private @Getter @Setter boolean m_is_occupied;
    private @Getter String m_clinic;

    public void acceptClient(){
        if (m_is_occupied = false){
            System.out.println("the doctor is busy");
        }
        else if (m_is_occupied = true) {
            System.out.println("welcome!");
        }
    }

    public void finishAppointment() {
        m_is_occupied = true;
    }



}
