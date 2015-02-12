class Employee
{
  String name
  int age
  int salary
  Employee(String name,int age,int salary)
  {
    this.name=name
    this.age=age
    this.salary=salary
  }
  public String toString()
  {
    return  name+salary
  }
  public static void main(String[]args)
   {
     List l=[new Employee("shipra",23,20000),new Employee("joly",25,30000),new Employee("amit",23,30000),new Employee("jyoti",24,40000)] 
          List list=l.findAll{emp->emp.salary<50000}
          println(list)
          println(l.max{it.age}.name)
          println(l.min{it.age}.name)
          println(l.max{it.salary}.name)
          println(l.findAll{it.name})
   }
}