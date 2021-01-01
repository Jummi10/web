# 웹 서버 CRUD

## REST API
- 요청에 적절한 응답을 한다.

### 요청을 받아 응답을 만들어주는 Controller
  - 요청한 주소를 맵핑한다.
    - RequestMapping (PostMapping, GetMapping, PutMapping, DeleteMapping)
    - PathVariable (/articles/{id})
    - RequestParam (/articles?author=lorem)
    - RequestBody (Request Body)
    
  - 적절한 서비스에게 위임한다.
      
  - 응답을 만들어준다.
    - ResponseEntity
      - 200 OK, 201 Created, 204 No-Content, 400 Bad Request, 404 Not-Found

### 요청을 받아 필요한 행위들을 위임하는 Application Service
  - 요청으로부터 적절한 도메인 모델을 생성하거나 가져온다.
  - 도메인 모델에게 행위를 위임한다.
  - DB와 관련된 행위는 Repository에게 위임한다.
    
### DB와 관련된 작업을 하는 Repository
  - 새로운 데이터를 저장하거나, 변경된 데이터를 업데이트 하기 위한 save
  - 정보를 조회하기 위한 find
    
### 도메인 로직 (비지니스 로직)을 수행하는 Domain Model
  - 요구사항을 수행한다.