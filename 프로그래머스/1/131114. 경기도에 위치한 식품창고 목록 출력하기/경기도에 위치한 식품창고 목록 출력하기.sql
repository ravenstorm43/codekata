-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, "N") FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE "경기도%"
// IFNULL(필드명, 대체할 값) : 레코드의 특정 필드의 값이 NULL일때 다른 값으로 대체하는 함수
