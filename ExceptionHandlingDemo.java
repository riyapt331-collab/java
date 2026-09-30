class invalidAgeException extends
Exception{
 public invalidAgeException(String message){
  super(message);
  }
}
 
public class ExceptionHandlingDemo
{
public static void validateAge(int age)throws invalidAgeException{
 if (age<18){
   throw new
invalidAgeException("Access denied:You must be at least 18 years old.");
}else{
System.out.println("Access granted:Age verified.");
}
}
public static void main(String[] args){
int[] userAges={21,15};
for(int age:userAges){
System.out.println("\nChecking age:"+age);
try{
validateAge(age);

if(age==21){
 int result=10/0;
}
}catch(invalidAgeException e)
{
System.out.println("Custom Exception caught:"+e.getMessage());
}catch(ArithmeticException e)
{
System.out.println("Runtime Exception caught:Cannot divide by zero.");
}
catch(Exception e){
System.out.println("General Exception caught:"+ e.getMessage());
}finally{
System.out.println("Cleanup:Age check processing completed.");
}
}
}
}