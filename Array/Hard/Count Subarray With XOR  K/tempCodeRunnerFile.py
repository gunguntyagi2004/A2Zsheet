
def countSubarray(arr,k):
    n=len(arr)
    count=0
    for i in range(n):
        xor=0
        for  j in range(i,n):
            xor^=arr[j]
            if  xor==k: