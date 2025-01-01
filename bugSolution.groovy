```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.isEmpty()) {
    return "Empty String"
  } else {
    return "Not Empty or Null"
  }
}

println myMethod(null)
println myMethod('')
println myMethod('Hello')

// Improved solution using the 'in' operator to check for null and empty strings, handling both gracefully.
def myMethodImproved(String str) {
  if (str in [null, '']) {
    return "Null or Empty String"
  } else {
    return "Not Null or Empty"
  }
}

println myMethodImproved(null)
println myMethodImproved('')
println myMethodImproved('Hello')
```