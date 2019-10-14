# Enter your code here. Read input from STDIN. Print output to STDOUT
n_A = int(input())
A = set(int(i) for i in input().split(" "))

n_other = int(input())
for i in range(n_other):
    operation = input().split(" ")[0]
    elements = set([int(i) for i in input().split(" ")])
    if operation == "intersection_update":
        A.intersection_update(elements)
    elif operation == "update":
        A.update(elements)
    elif operation == "symmetric_difference_update":
        A.symmetric_difference_update(elements)  
    elif operation == "difference_update":
        A.difference_update(elements)

print(sum(A))
