Remarks
-------
* The finatra code is not available yet in maven central and only in maven.twttr.com
* Finatra uses Guice for depdendency injecten. However, as an application develoer you don  have to use Guice
* Jackson is used for JSON marshalling/de-marshalling
* Example POST:
```
{
    "num64": 9223372036854775807,
    "flag": true,
    "str": "parent",
    "type": "FOO",
    "children": [
        {
            "num64": 9223372036854775807,
            "flag": true,
		    "type": "BAR",
            "str": "child 1",
            "children": [{"num32": 1}],
            "num32": 2147483647
        }
    ],
    "num32": 2147483647
}
``` 

Should yield 2 descendants