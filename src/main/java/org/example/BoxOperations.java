package org.example;

public interface BoxOperations <T, V extends Number>{



      void setLargestValue(V firstInput, V secondInput);

      V getLargestValue();


}
