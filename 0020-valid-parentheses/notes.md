This is a pairing problem, I can come up with 2 methods.

# Solution 1
Since this is a pairing problem, we can easily think of using a map to store the paired brackets. This way, when we check the characters in `s` one by one, we can use the map to query the corresponding brackets.

The process could be: for each character `c`, if it's a
1. left bracket, then we push it into the stack;
2. right bracket, check if the previous bracket is the corresponding left bracket.

In addition, we need to consider the edge condition when the stack is empty.

# Solution 2
The first solution is straightforward, but we can optimize it.

What if we don't use map? We can store what is expected, not what is seen.

Since there are only 3 pairs of parentheses, and we know the valid combinations of the parentheses, we could try to deal with each bracket.

If we don't use map, when we meet a left bracket, we couldn't simply push it into the stack because we couldn't find the corresponding right one.

So we can push the corresponding right bracket into the stack directly. This way, we can manually pair the bracket at one time, and also eliminate the map to simplify the code.

The essence of this approach is expectation-oriented, and it is applicable to many pairing problems.