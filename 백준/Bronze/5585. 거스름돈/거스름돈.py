N = 1000 - int(input())
answer = 0;
arr = [500,100,50,10,5,1];
for i in arr:
    if N//i: 
        answer += N//i;
    N = N % i
print(answer);