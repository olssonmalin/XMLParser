# XMLParser

## Build

### Maven

In root of project
`$ mvn package`

or

Run `package` in Maven project in IntelliJ (XMLParser/Lifecycle/package)

## Usage


```
// From root of project
$ cd target/classes java org.softhouse.Main <input_file.txt> <output_filename.xml>
```

Arguments are optional.
**inputfile** defaults to use text.txt in src/main/resources/
**outputfile** if not provided, XML will be printed in system output

