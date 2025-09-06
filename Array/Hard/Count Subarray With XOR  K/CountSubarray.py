
# def countSubarray(arr,k):
#     n=len(arr)
#     count=0
#     for i in range(n):
#         xor=0
#         for  j in range(i,n):
#             xor^=arr[j]
#             if  xor==k:
#                 count+=1
#     return count


from collections import defaultdict;
def countSubarray(arr,k):
    n=len(arr)
    xor=0
    count=0
    dict=defaultdict(int)
    dict[0]=1
    for i in range(n):
        xor^=arr[i]
        target=xor^k
        if target in dict:
            count+=dict[target]
        else:
            dict[xor]+=1    

    return count



arr=[4,2,2,6,4]
target=6
print("no of subarrays are",countSubarray(arr,target))