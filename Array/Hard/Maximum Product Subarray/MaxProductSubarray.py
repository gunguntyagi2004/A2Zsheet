def maxProductSubarray(arr):
    n=len(arr)
    maxProduct=0
    for i in range(n):
        product=1
        for j in range(i,n):
            product*=arr[j]
            maxProduct=max(maxProduct,product)
    return maxProduct


def maxProductSubarray(arr):
      n=len(arr)
      leftProduct=1
      rigthProduct=1
      ans=arr[0]

      for i in range(n):
         leftProduct=(1 if leftProduct==0 else leftProduct)
         rigthProduct=(1 if rigthProduct==0 else rigthProduct)

         leftProduct *=arr[i]
         rigthProduct *=arr[n-1-i]

         ans=max(ans,max(leftProduct,rigthProduct))
      return ans


arr=[1,2,-3,0,-4,-5]
print("the maximum product is",maxProductSubarray(arr))