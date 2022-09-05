# To Do List

리액트와 스프링 부트 코틀린으로 만든 간단한 To Do List 입니다.

## 사용한 라이브러리들
리액트 - 자바스크립트  
스프링 부트 - 코틀린  

### `그 밖에`

리액트는 axios를 통해 spring의 get, post 등의 요청들을 가져올 수 있게 하였습니다.
따로 components 분리는 하지 않았지만 프록시를 통하면 component 분리를 할 수 있습니다.

스프링 부트는 리액트와 원활한 연결을 위하여 CORS (교차 출처 리소스 공유)릉 통해 3000포트가 8080 포트에 접근할 수 있도록 config 폴더에서 설정을 해주었습니다.

데이터베이스는 Docker의 mySQL image를 생성하여 사용하였으며 저장된 데이터는 DBeaver 도구를 이용하여 확인하였습니다.

나머지는 특별하게 더 한 것 없이 MVC패턴으로 CRUD작업을 하였습니다.
