n_eng = int(input())
eng_students_s = input()
eng_students = set([int(i) for i in eng_students_s.split(" ")])

n_french = int(input())
french_students_s = input()
french_students = set([int(i) for i in french_students_s.split(" ")])

print(len(eng_students ^ french_students))
