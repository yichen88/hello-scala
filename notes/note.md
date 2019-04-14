#### Side effect
TODO 

#### Parameterless method
If methods returns value, should def/use with `()`.\
Example: `size()` vs `list.length`

#### Parameterization
means configuring an instance at the point in your program that you create that instance.\
ex: parameterize set/list/array with type String

#### Array's setter && getter
`arr(i)` equivalent to `arr.apply(i)`\
`arr(i) = 42` equivalent to `arr.update(i, 42)`

#### mutable.HashMap vs HashMap
TODO 

__Companion object__: Any static methods that you would have placed in class WorldlyGreeter in Java, you’d put in companion object WorldlyGreeter in Scala.\
When a singleton object shares the same name with a class, it is called that class’s companion object. You
must define both the class and its companion object in the same source file.

__Auxiliary constructors__: Overloaded constructors

__procedure style__: With curly braces but no equals sign, essentially the same as a method that explicitly declares its result type to be Unit. 

#### Unit
When a value’s type is converted to Unit, all information is lost about
that value. In essence, `()` is the value that means no value.

```scala
def g {"hi"}
println(g) // ()
println(Unit)// object scala.Unit
```



