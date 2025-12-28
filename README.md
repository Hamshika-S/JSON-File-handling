**Technologies Used**

* Java (OpenJDK 25)
* Maven
* Jackson JSON Library
* IntelliJ IDEA

**Imports used**

*import java.util.Iterator;*
Provides a way to loop through elements sequentially
Used to iterate over JSON key–value pairs
Supports hasNext() and next() methods

*import java.util.Map;*
Holds one JSON field at a time
getKey() returns the JSON key
getValue() returns the corresponding JSON value

*import com.fasterxml.jackson.databind.ObjectMapper;*
Core class of the Jackson library
Responsible for parsing JSON files
Converts JSON into a tree structure

*import com.fasterxml.jackson.databind.JsonNode;*
Represents a node in the JSON tree
Can hold any JSON value (string, number, boolean, object, array)
