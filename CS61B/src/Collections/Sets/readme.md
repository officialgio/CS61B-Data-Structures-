

#Lecture 14: Disjoint Sets
- ListOfSetsDS: Store connected components as a List of Sets (slow, complicated).
- QuickFindDS: Store connected components as set ids.
- QuickUnionDS: Store connected components as parent ids.
WeightedQuickUnionDS: Also track the size of each set, and use size to decide on new tree root.
- WeightedQuickUnionWithPathCompressionDS: On calls to connect and isConnected, set parent id to the root for all items seen.

