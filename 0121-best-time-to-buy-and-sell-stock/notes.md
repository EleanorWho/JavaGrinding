Imaging we are at the i-th day, we have the price of this day, which is price[i].

So the profit of this day is `profit = price[i] - the lowest price that we have seen before price[i]`.

In this case, we'd better maintain the lowest price we've seen before, and then find the highest price we meet.

And if we keep the lowest price we've seen before, then whenever we want to sell the stock, we can ensure that we have the optimized selling at this day.

We can have two methods to have these two prices, one of which is brute force, the nested loop, with time complexity of O(n2).

We can also maintain these two pieces of information in single loop, only if we keep updating the lowest and highest price. Just notice the sequence of updating.