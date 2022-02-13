# MyBlog-Project-Solo


#첫 번째 개인 프로젝트 블로그 만들기 

#Stack : Spring-boot, MySql, Thymleaf, Jpa


#API

| 기능        | 메서드    | URI                            | request    | response                                                  |
|:----------|:-------|:-------------------------------|:-----------|:----------------------------------------------------------|
| 전체 게시글 목록 | GET    | /                             |            |      |
| 게시글 작성    | POST   | post/new                           | postDto    |                      |
| 게시글 조회    | GET    | post/{post_id}                 |            |     |
| 게시글 수정    | PATCH  | post/{post_id}                 |            |     |
| 게시글 삭제    | DELETE | post/{post_id}                 |            |     |
| 댓글 등록     | POST   | comment                        | commentDto |  |
| 댓글 수정     | PATCH  | comment/{comment_id}           |            |  |
| 댓글 삭제     | DELETE | comment/{post_id}/{comment_id} |            |  |
