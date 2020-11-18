## Engine Bug Counting (R1-Q1)

We manually inspected the root causes of engine bugs and classified them based
on where they are located in ES11.  For example, Moddable XS had 20 engine bugs
located in different parts of ES11.

## Target of JEST (R2-Q1)

As we explained in Evaluation section (7p), we focused on _the core semantics
of JavaScript_ except the strict mode and EarlyError rule. Thus, for built-in
libraries, we only targeted functions related to the core language semantics,
such as Object, Function, Array, etc.


## Coverage Compared With Test262 (R2-Q2, R3-Q2)

Although we identified several branches not reachable by Test262 are covered by
JEST, our tool had less branch coverage (78.30%) than Test262 (91.61%) for
ES11. To cover branches not covered by JEST, the synthesized programs should
construct a specific environment satisfying complex semantical not only
syntactical conditions. However, program mutators in this paper are simple and
syntax-directed thus it is difficult to synthesize the program satisfying
complex semantical conditions. For example, to cover deep semantics of
`Iterator` objects, mutators should construct an object having
`Symbol.iterator` property with a function that returns a specific object for
iteration configuration.  We believe that they could be covered via more
advanced semantics-aware program mutators.


## Advantages Compared with Test262 (R2-Q3, R3-Q1)

Although most of modern JavaScript engines are already tested by Test262, we
found new bugs using JEST and _all of them cannot be detected by Test262_. It
is due to the following advantages of JEST compared to Test262.

**Automatic Update** Since ECMAScript is annually updated, Test262 must be
manually updated for new language features. However, our tool can automatically
generate conformance tests not only for the latest version but also for future
versions using mechanized specification extracted by JISET.

**Automatic Assertion Injection** Even thought Test262 have higher coverage,
many tests in Test262 check only small parts related to the specific target
semantics because it is labor-intensive to manually write assertions to check
all conditions.  On the other hand, JEST _automatically_ injects assertions
that checks _all conditions_ that must be satisfied at the end of the program.


## Insight from Detected Bugs (R2-Q4)

Many bugs in ES11 and JavaScript engines are caused by breaking the
backward-compatibility. It is difficult to update the specification or
implementations in tandem with backward-compatible semantics. We believe that
_N+1-version differential testing_ can rescue from such difficulty via
cross-referencing oracle. If other programming languages provide mechanized
specifications like JISET for JavaScript, we believe that it is worth to apply
our approach for them.


## More explanation of Figure 1 (R3-Q3, R3-Q4)

The running example in Figure 1 is the specification bug ES11-5 of Table III.
The prefix `?` is one of the most confusing notation in ECMAScript. It
indicates that "check if the return value is the abrupt completion, then
immediately return the value".  In ToPrimitive, `? OrdinaryToPrimitive(…)`
checks whether the return of `OrdinaryToPrimitive` is an abrupt completion.
However, `Abstract Equality Comparison` does not check the return value of
`ToPrimitive`. Thus, it compares `42` with an abrupt completion constructed by
`throw "err";` and returns `false`.
