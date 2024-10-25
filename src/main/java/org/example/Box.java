package org.example;

import java.util.Collections;
import java.util.List;

public class Box <T, V extends Number & Comparable<V>> implements BoxOperations <V>{
    T genericAttribute;
    V largestValue;
    private String name;

    public Box(String name){
        this.name = name;
    }

    @Override
    public void setLargestValue(V firstInput, V secondInput) {
        if (firstInput.doubleValue() > secondInput.doubleValue()) {
            this.largestValue = firstInput;
        }else {
            this.largestValue = secondInput;
        }
    }
    public boolean hasSameName(Box<?,?>secondBox){

        return this.name.equals(secondBox.name);
    }
    public T castValue(Object valueToCast){
        return (T) valueToCast;
    }


    @Override
    public void setLargestValueFromList(List <V> list){
        this.largestValue = Collections.max(list);

    }
    @Override
    public V getLargestValue() {
        return largestValue;
    }

    public T getGenericAttribute() {
        return genericAttribute;
    }


    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }
}
