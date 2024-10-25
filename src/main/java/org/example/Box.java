package org.example;

public class Box <T, V extends Number> implements BoxOperations{
    T genericAttribute;
    V largestValue;
    private String name;

    public Box(String name){
        this.name = name;
    }

    @Override
    public void setLargestValue(Number firstInput, Number secondInput) {
        if (firstInput.doubleValue() > secondInput.doubleValue()) {
            this.largestValue = (V) firstInput;
        }else {
            this.largestValue = (V) secondInput;
        }
    }
    public boolean hasSameName(Box<?,?>secondBox){

        return this.name.equals(secondBox.name);
    }
    public T castValue(Object valueToCast){
        return (T) valueToCast;
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
