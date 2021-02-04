package com.infotech.Implementation;

import com.infotech.interfaces.SampleInterface;

import java.util.Collections;
import java.util.List;

public class SampleInterfaceImplementation implements SampleInterface {

    @Override
    public Integer getMinName(List<Integer> intList) {
        return Collections.min(intList);
    }

}
