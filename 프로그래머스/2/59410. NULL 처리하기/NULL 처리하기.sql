-- 코드를 입력하세요
SELECT ANIMAL_TYPE, IFNULL(NAME, "No name"), SEX_UPON_INTAKE FROM ANIMAL_INS
// IFNULL(필드명, 대체할 값) : 레코드의 특정 필드의 값이 NULL일때 다른 값으로 대체하는 함수
