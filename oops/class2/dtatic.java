
/*

  Static - which are dependent on class itself directly it initialize only  1 time because
  class defines only one time it exists lifetime in a file

  Non-Static - which are dependent on object itself it  initializes everytime  at the time of object creation
  it exists temporarily and allowed for garbage collector when no line or arrow is present

  Non-Static can contain static but static cannot contain a thing which are non-static
  because the reason is class can access static thing but cannot access non-static thing
  on the other hand object can access both static and non-static thing and

   one more thing I wanted to add in this for methods confusion

   ... Some simple queries
  ? Why psvm is static
  bcz it is class dependent , it is a very first thing to be executes by the compiler
   therefore it cannot be object dependent as compare to other function

  ? Why class is non-static and inner  class is static
  Main class cannot be static bcz there is no class where main class depends on
  non static doesn't mean that it is object dependent as it is a creator of object
  therefore it not contain static  and non-static keyword since class exist lifetime till life of a file,
  but it is a main class so it cannot be static

  inner-class   depends on class to exist lifetime to main class

deep dive into it
  locally is dependent on its function or class it can be static as well non-static can exist to a variable
   or function which can be static and non-static respectively

  which bahar accessible no hai locally.

  global things are  jo bhi ho bahar ka function ho yaa bahar ka variable inside that function there matters
  of static and non-static stuff

 */







/*
let's again update our concept
static matlab that it is direct in relation
 with a class so when new instance creates this static are accessible with the form preserved by class
 and when inside a function I used the same hierarchy type like similar class linked i.e. static function
 or if I wanted to use the other thing I have to define the hierarchy otherwise it cannot relate with it
 Object -- static|
 |   |        || |-----> object gets both of these access and class access static methods only
 |   |        || |
 |nonstatic Class|
 |_______________|
 so here class is going to access static method that is knows to that method but the non - static method is object relation
 so , inside static non - static not access directly we have to define the reference  since , we are not defining the reference
 it considers as it is itself of same reference but, it is not therefore that is the reason one more thing
 static are not access to child class because I don't want that class things are to be changed

 static are the early binding therefore it knows the memory location that's why it can be hide but not override
 and the reference copied of the in the child class and child knows the override function reference
 parent class know only about its reference part
 */



/*
now the final concept is the static
is scoped to objects only inside a same package therefore the glitch you see till now is cleared
 */