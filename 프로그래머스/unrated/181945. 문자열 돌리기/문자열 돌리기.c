#include <stdio.h>
#define LEN_INPUT 11

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
   
    int len = strlen(s1); // 문자열의 길이 계산

    for (int i = 0; i < len; i++) {
        printf("%c\n", s1[i]); // 각 문자를 출력하고 개행
    }
    return 0;
}
