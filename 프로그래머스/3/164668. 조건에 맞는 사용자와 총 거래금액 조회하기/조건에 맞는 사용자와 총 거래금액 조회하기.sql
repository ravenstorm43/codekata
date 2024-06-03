-- 코드를 입력하세요
SELECT USER.USER_ID, USER.NICKNAME, SUM(BOARD.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD AS BOARD INNER JOIN USED_GOODS_USER AS USER ON BOARD.WRITER_ID = USER.USER_ID 
WHERE BOARD.STATUS = "DONE" GROUP BY USER.USER_ID HAVING SUM(BOARD.PRICE) >= 700000 ORDER BY TOTAL_SALES