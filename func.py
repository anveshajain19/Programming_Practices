# WRITING SOME CODE IN PYTHON USING DIFFERENT FUNCTIONS! 

#Following coding standards of "GOOGLE".
# Starting Date / time: 7/11/22 12:00AM  Ending Date / time: 15/11/22 5:26PM 
# Total time given: 2 hrs
#Total line of code: 130
#Number of functions: 12
#CHECK PRIME
def isprime(n):
    prime_flag = 0
    if(n > 1):
        for i in range(2, int(sqrt(n)) + 1):
            if (n % i == 0):
                prime_flag = 1
                break
        if (prime_flag == 0):
            return True
        else:
            return False
    else:
        return True

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#LCM
def lcm(a,b):
    return a*b//(math.gcd(a,b))

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#SUM OF DIGITS
def countdigit(n):
    ans=0
    while n:
        ans+=n%10
        n//=10
    return ans

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#RETURN NUMBER OF PRIME FACTORS
def number_of_primefactor(n):
    l = []
    while n % 2 == 0:
        l.append(2)
        n = n // 2
    for i in range(3, int(math.sqrt(n))+1, 2):
        while (n % i == 0):
            l.append(i)
            n = n // i
    if n > 2:
        l.append(n)
    return list(set(l))

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#COUNT FACTORS
def count_factors(n):
    i = 1
    c = 0
    ans=[]
    while i <= math.sqrt(n):
        if n % i == 0:
            if n//i == i:
                c += 1
                ans.append(n//i)
            else:
                c += 2
                ans.append(i)
                ans.append(n//i)
        i += 1
    return ans

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#LIST TO STRING
def ListToStr(s): 
    str1 = "" 
    for ele in s: 
        str1 += ele  
    return str1

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#STRING TO LIST
def StrtoList(string):
    li = list(string.split(" "))
    return li

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
# STRING TO LIST CHARACTER WISE

def Convert(string):
    list1 = []
    list1[:0] = string
    return list1

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#AND OF ALL ELEMENTS OF ARRAY
def find_and(arr):

    ans = arr[0]
     
    for i in range(1, len(arr)):
        ans = ans&arr[i]
    return ans

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
# RETURNS 2D LIST OF ELEMENTS AND ITS COUNT
def element_count(s):
    # returns 2-D list of elements and its count
    l = []
    k = s[0]
    c = 0
    for ele in s:
        if ele == k:
            c += 1
        else:
            l.append([k, c])
            k = ele
            c = 1
    l.append([k, c])
    return l

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#SUBSEQUENCE
def printSubsequences(arr, index, subarr):

    if index == len(arr):
       
        if len(subarr) != 0:
            print(subarr)
       
    else:
      
        printSubsequences(arr, index + 1, subarr)
           
        printSubsequences(arr, index + 1, 
                            subarr+[arr[index]])
       
    return

#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
#SUBARRAYS
def subarray(arr): 
    
   sub_arr = [[]] 
   for i in range(len(arr) + 1): 
        for j in range(i + 1, len(arr) + 1): 
            sub = arr[i:j] 
            sub_arr.append(sub) 
   return sub_arr 
#::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


   
