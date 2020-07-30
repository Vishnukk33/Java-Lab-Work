class Max
{
  public static <T extends Comparable<T>> T maximum(T... elements){
    T max = elements[0];
    for(T element : elements)
    {
      if(element.compareTo(max) > 0)
      {
        max=element;
      }
    }
    return max;
  }
  
  public static void main(String[] args)
  {
  
    System.out.println("Integer max: "+maximum(Integer.valueOf(32), Integer.valueOf(456), Integer.valueOf(897)));
    System.out.println("Double max: "+maximum(Double.valueOf(5.6), Double.valueOf(147.8), Double.valueOf(18.7301)));
    System.out.println("Boolean max: "+maximum(Boolean.TRUE, Boolean.FALSE));
    System.out.println("String max: "+maximum("Hello","Heyya","Congrats","Vishnu"));
    System.out.println("Byte max: "+maximum(Byte.MIN_VALUE,Byte.MAX_VALUE));
  }
}
