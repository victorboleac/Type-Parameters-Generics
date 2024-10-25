package org.example;

import java.util.List;

public interface BoxOperations <V extends Number & Comparable<V>>{



      void setLargestValue(V firstInput, V secondInput);
      void setLargestValueFromList(List<V> list);



      V getLargestValue();


}
