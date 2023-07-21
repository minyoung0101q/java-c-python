lol = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]

print(lol[0])       # 첫 번째 리스트 출력: [1, 2, 3]
print(lol[2][1])    # 세 번째 리스트의 두 번째 요소 출력: 7

for sub in lol:     # lol 리스트의 각 하위 리스트(sub)에 대해 반복
    for item in sub:    # 하위 리스트(sub)의 각 요소(item)에 대해 반복
        print(item, end="")    # 요소를 줄바꿈 없이 출력
    print()    # 하위 리스트(sub)의 출력이 끝날 때마다 줄바꿈을 출력
