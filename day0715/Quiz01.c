#include <stdio.h>
#define SIZE 5

int main(void) {
    int arr[SIZE] = {75, 100, 95, 50, 85};
    int i, j, temp;
    
    for (i = 1; i < SIZE; i++) {
        for (j = 0; j < SIZE - i; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];  // 오타 수정
                arr[j + 1] = temp;
            }
        }
    }
    
    for (i = 0; i < SIZE; i++) {
        printf("%d ", arr[i]); 
    }
    
    return 0;  // main 함수의 반환 값 추가
}
