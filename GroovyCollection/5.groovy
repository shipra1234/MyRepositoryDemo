List l=[1,2,3,4,5]
int size=l.size()

for(i in 0..size-1)
{ 
  int s=i%2
  println(s)
  if(s==1)
   {
   println( l.removeAt(i))
   }
  }
 println(l)
 