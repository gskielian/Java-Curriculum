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

cd back two directories with:
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
java -classpath ./com/stuff.HelloWorld

```


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



## Android
