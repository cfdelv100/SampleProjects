import random
import time
# Binary Search
# Divide and Conquer algorithm, and search for target
# Much more better time complexity 

# simple linear search
def linear_search(x, target):
    for i in range(len(x)):
        if x[i] == target:
            return i
    return -1

# binary search
# x = [1,3,5,10,12] should return a 3
def binary_search(x, target, low=None, high=None):
    if low is None:
        low = 0
    if high is None:
        high = len(x) - 1
    if high < low: 
        return -1

    mid = (low + high) // 2  #2
    
    if x[mid] == target:
        return mid
    elif target < x[mid]:  
        return binary_search(x, target, low, mid - 1)
    else:
        # target > x[mid]
        return binary_search(x, target, mid + 1, high)


if __name__ == '__main__':
    x = [1, 3, 5, 10, 12]
    target = 10
    print('linear type search is: ', linear_search(x, target))
    print('Binary search is: ', binary_search(x, target))
    
    # time comparing with a list of 10000
    length = 10000
    sort_list = set()
    while len(sort_list) < length:
        sort_list.add(random.randint(-3 * length, 3 * length))
    sort_list = sorted(list(sort_list))
    
    
    # linear search list time
    start = time.time()
    for target in sort_list:
        linear_search(sort_list, target)
    end = time.time()
    x1 = (end - start)/length
    print('Linear Search time of 10000: ', x1, 'seconds')
    
    # Binaryt Search list time
    start = time.time()
    for target in sort_list:
        binary_search(sort_list, target)
    end = time.time()
    x2 = (end - start)/length
    print('Binary Search time of 10000: ', x2, 'seconds')
    
    # Comparing two times found 
    if x1 < x2:
        print('Linear Search is faster')
    elif x2 > x1:
        print('Binary search is faster')
    
    
