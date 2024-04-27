import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    char b=sc.next().charAt(0);
    float c=sc.nextFloat();
    double d=sc.nextDouble();
    String e=sc.next();
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a%b);
      System.out.println(a%b);
      System.out.println(a++);
      System.out.println(a--);
      System.out.println(--a);
      System.out.println(++a);
      System.out.println(a++ + ++a);
      System.out.println(a++ - ++a);
      System.out.println(a++ * ++a);
      System.out.println(a<<1);
      System.out.println(b>>1);
      System.out.println(d<<2);
      System.out.println(c>>2);
      System.out.println(a==b);
      System.out.println(a!=b);
      System.out.println(a<c);
      System.out.println(a>b);
      System.out.println(a<=c);
      System.out.println(a>=b);
      System.out.println(a&b);
      System.out.println(a|c);
      System.out.println(a<b&&a!=b);
      System.out.println(a==b||a<b);
      System.out.println(a+=b);
      System.out.println(a-=2);
      System.out.println(a*=5);
      System.out.println(a%=7);
      System.out.println(a<<=4);
      System.out.println(a>>=5);
      if(a!=b)
      {
          System.out.println("Yes");
      }
      else if(a<b||b==e) 
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }
      switch(a)
      {
          case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 66;
            System.out.println("Thurday");
            break;
        case 100:    
            System.out.println("Friday");
            break;
            
        Default:
            System.out.println("default");
      }
      }  
    }
