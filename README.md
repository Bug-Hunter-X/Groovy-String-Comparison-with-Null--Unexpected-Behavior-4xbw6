# Groovy String Comparison with Null: Unexpected Behavior

This repository demonstrates an uncommon bug in Groovy related to string comparison with null using the '==' operator.  Groovy's dynamic typing allows comparisons that might not behave as expected in more strictly typed languages.  This can lead to subtle errors that are difficult to track down.

The `bug.groovy` file shows a simple method attempting to handle null and empty strings. The unexpected behavior lies in the comparison of strings with null using '=='.  While this seems intuitive, it differs from how null checks usually behave in other languages.

The `bugSolution.groovy` file provides a corrected version, demonstrating safer and more predictable ways to handle string comparisons in the presence of potential null values.
