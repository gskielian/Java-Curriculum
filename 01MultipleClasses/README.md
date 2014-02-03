## Command Line



#### Organize


Create some folders to organize your project:

```sh
mkdir com && mkdir com/stuff
```

then your directory tree should look like this (type `tree` to the command line):

```sh
.
└── com
    └── stuff
```

Now go into the `stuff` directory:
```sh
cd com/stuff
```

### Write the code

and start writing your `HelloWorld.java` file:
```sh
vim HelloWorld.java
```

write these into your HelloWorld.java file:
```java
package com.stuff;

public class HelloWorld {
  public static void main(String args[]) {
    
    System.out.println("Hello World");
    
    HelperClass.sayWassup();
    
  }
}
```

```sh
vim HelperClass.sayWassup();
```

```java
package com.stuff;

public class HelperClass {
  public class sayWassup() {
    System.out.println("Wassup");
  }
}
```

The `package com.stuff` makes sure each file has access to everything in the `./com/stuff` folder (and can use the public abilities of the other classes).

`HelloWorld.class` can therefore use HelperClass's `sayWassup` ability (see the line `HelperClass.sayWassup`)


### Compiling and Making Projects

This ain't no simple sketch, this is a _project_.  

Take a few steps back before you compile and run the glory :sunglasses:


Go ahead and cd back two directories with:
```sh
cd ../../
```

and type `tree`, your output should look like this: 
```sh
.
└── com
    └── stuff
        ├── HelloWorld.java
        └── HelperClass.java
```

Compile:
```sh
javac -cp . ./com/stuff/*.java
```



run with:
```sh
java -classpath . com/stuff.HelloWorld

```

Your code should say `Hello World` then say `Wassup`, like this:

```
Hello World
Wassup
```

Congrats! You can now use the special powers of the other classes in your package directory!



#### Fun
for fun, type `tree` and notice the stuff made by your `javac` command step:
```sh
.
└── com
    └── stuff
        ├── HelloWorld.class
        ├── HelloWorld.java
        ├── HelperClass.class
        └── HelperClass.java

```


## IDE

Use Eclipse to make a helper class that turns inches into a meaningful dimension like cm.

<!-- just multiply by 2.54 -->

## Android

Make an Android application that uses a helper class to simplify making a toast. 


How to make a Toast:
```java
Toast.makeText(getApplicationContext(), "I am in your device, accessing your androids! = )", Toast.LENGTH_LONG).show();
```


Reduce the time to type, make it look like this:
```java
HelperClass.makeToast("Your fingers thank you!");
```

fun fun, see how fast it can be done.

<!--## Why helper classes

less scrolling in code
can work with friends  -- I'll make the main, you make a helper class which connects to the port I specify
reusable code -- just copy pasta into other project, and -- voila! -- more superpowers
also if you name it sensibly, it makes your code easier to read -- this will be important when you make your teams
-->
