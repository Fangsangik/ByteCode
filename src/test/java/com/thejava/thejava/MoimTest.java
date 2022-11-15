package com.thejava.thejava;

import com.thejava.thejava.ByteCode.Moim;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoimTest {

    @Test
    public void isFull(){
        Moim moim = new Moim();
        moim.maxNumberOfAttendes = 100;
        moim.numberOfEnrollment = 10;
        Assertions.assertFalse(moim.isEnrollmentFull());
    }
}
