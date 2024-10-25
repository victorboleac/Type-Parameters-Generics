package org.example;

public class Box <T, V extends Number>{
    private T genericAttribute;
    private V largestValue;

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }
    @Override
    public void setLargestValue(V firstInput, V secondInput) {
        if (firstInput.doubleValue() > secondInput.doubleValue()) {
            this.largestValue = firstInput;
        }else {
            this.largestValue = secondInput;
        }
    }
}
