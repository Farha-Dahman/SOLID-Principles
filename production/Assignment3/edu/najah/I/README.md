## Interface Segregation Principle:

The goal of this principle is to reduce the side effects of using larger interfaces by breaking application interfaces into smaller ones.

That is mean When there is this method in Eagle class (swim) it's not supported the interface principle is violets. 
The same thing happened in Penguin class, the fly method it's never used on it.


Because of that we followed the principle of interface separation and reconfigure the original interface -> 
we create 2 interfaces (Flyable,Swimming). In this way we didn't force the classes: 
Eagle, Penguin to implement methods that's not supported.
