# MyBlog-Project-Solo


#첫 번째 개인 프로젝트 블로그 만들기 

#Stack : Spring-boot, MySql, Thymleaf, Jpa


#API - 
- 타임리프가 POST,GET 밖에 없어서 PATCH, DLETE, PUT 등 메서드 사용 x
| 기능        | 메서드    | URI                            | request    | response                                                  |
|:----------|:-------|:-------------------------------|:-----------|:----------------------------------------------------------|
| 전체 게시글 목록 | GET    | /                             |            |      |
| 게시글 작성    | POST   | post/new                           |     |                      |
| 게시글 조회    | GET    | posts/                 |            |     |
| 게시글 수정    | POST  | post/{post_id}/edit                 |            |     |
| 게시글 삭제    | POST | post/{post_id}/delete                 |            |     |
| 댓글 등록     | POST   | comment/{post_id}                        |  |  |
| 댓글 수정     | POST  | comment/{comment_id}/edit           |            |  |
| 댓글 삭제     | POST | comment/{comment_id}/delete |            |  |
