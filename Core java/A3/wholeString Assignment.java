Public Class str_a3 {
  Public Static void main(String[] args){
    //q1.
    String str="Hello World";
    System.out.println(str.length());
    //q2.
    String a="Hello";
    String b="How are you?";
    String x=a.concat(b);
    System.out.println(x);
    //q3.
    String one="java string pool resfers to collection of strins which are stored in heap memory";
    System.out.println(one.toLowercase());
     System.out.println(one.toUppercase());
     System.out.println(one.replace('a'.'$'));
    System.out.println(one.contains("collection"));
    String two="java string pool refers to collection of string which are stored in heap memory";
    System.out.println(one.compareTo(two));
    System.out.Println(one.equals(two));
    
    //Assignment on string buffer
    String 1="stringBuffer";
    String m=" is a peer class of string";
    String n="that provides much of";
    String 0="thefunctionality of strings";
    StringBuffer p=new StringBuffer();
    p.append(1);
    p.append(" "+m);
    P.append(" "+n);
    p.append(" "+o);
    System.out.println(p);
    
    //part2
    StringBuffer in=new StringBuffer("it is used to at the specified index");
    in.insert(14,"insert text ");
    System.out.println(in);
    
    //part3
    StringBuffer rev=new StringBuffer("this method returns the reversed object on which it was called");
    System.out.println(rev.reverse());
    
    //Assignment on StringBuilder 
    
    StringBuilder Q=new StringBuilder();
    q.append(1);
    q.append(" "+m);
    q.append(" "+n);
    q.append(" "+o);
    System.out.println(q);
   
    //part2
    StringBuilder s1= new StringBuilder(" it is used to at the specified index");
    s1.insert(14,"insert text ");
    System.out.println(s1);
    
    //part3
    StringBuilde s2=new StringBuilder(" this method returns the reserved object on which it was called");
    System.out.println(s2.reverse());
  }
}
