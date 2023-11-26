class Solution:
    def twoSum(self, nums: List[int], target: int):
        result = []
        for i in range(len(nums)-1):
            #print(i)
            for j in range(i+1,len(nums)):
                if nums[i] + nums[j] ==  target:
                    result.extend([i,j])
                    #result.append(j)
                    break
        return result