# 👉 GROW [ 구인ㆍ구직 프로젝트 ]

<p align="center">
  <img src="https://github.com/chugue/grow-ssr-deploy/assets/30003848/a88227f4-671c-44aa-ad06-c50c97d41a82"  style="width: 50%; height: auto;"/>
</p>

> ## 발표 자료 PDF
[미니 1차 휴먼 클라우드 PPT.pdf](https://github.com/chugue/grow-ssr-deploy/files/15454109/1.PPT.pdf)

<br>

# 👉 프로젝트 소개 (핵심로직)
* 그로우 프로젝트는 성장하다는 의미를 가지고 있으며, 이 플랫폼을 이용하는 지원자/기업 모두 같이 성장하자는 의미를 담고 있습니다.
* 기업 담당자는 플랫폼에 회원가입을 하고 구인 공고를 등록합니다.
* 일반 사용자는 플랫폼에 회원가입을 하고 자신의 이력서를 등록할 수 있습니다.
* 기업 담당자는 공개된 이력서를 열람, 또는 각각의 공고에 대한 지원자를 확인하고 합격 여부를 결정할 수 있습니다.
* 일반 사용자는 원하는 공고에 이력서를 지원 할 수 있습니다. 

<br>

# 👉 개발팀 소개


<table style="width:100%; text-align:center;">
  <tr>
    <th style="text-align:center;">김성훈(팀장)</th>
    <th style="text-align:center;">심유주</th>
    <th style="text-align:center;">송채현</th>
    <th style="text-align:center;">김지훈</th>
    <th style="text-align:center;">하승진</th>
  </tr>
  <tr>
    <td style="text-align:center; vertical-align:middle;"><img width="160px" src="https://avatars.githubusercontent.com/u/30003848?v=4" /></td>
    <td style="text-align:center; vertical-align:middle;"><img width="160px" src="https://avatars.githubusercontent.com/u/153582123?v=4" /></td>
    <td style="text-align:center; vertical-align:middle;"><img width="160px" src="https://avatars.githubusercontent.com/u/97007464?v=4"/></td>
    <td style="text-align:center; vertical-align:middle;"><img width="160px" src="https://avatars.githubusercontent.com/u/81667935?v=4" /></td>
    <td style="text-align:center; vertical-align:middle;"><img width="160px" src="https://avatars.githubusercontent.com/u/153582360?v=4" /></td>
  </tr>
  <tr>
    <td style="text-align:center; vertical-align:middle;"><a href="https://github.com/chugue">@chugue</a></td>
    <td style="text-align:center; vertical-align:middle;"><a href="https://github.com/kjh5848">@kjh5848</a></td>
    <td style="text-align:center; vertical-align:middle;"><a href="https://github.com/LifeIsOne">@LifeIsOne</a></td>
    <td style="text-align:center; vertical-align:middle;"><a href="https://github.com/tkffkels93">@tkffkels93</a></td>
    <td style="text-align:center; vertical-align:middle;"><a href="https://github.com/p4rksk">@p4rksk</a></td>
  </tr>
</table>

> ## 기술 스택
![기술스택](https://github.com/chugue/project-grow/assets/153585866/8f93f7a9-4368-4b70-830e-d3a9c2de545f)  
* JDK 21
* Springboot 3.2.2
* 테스트 h2 DB
* JAVAScript
* HTML
* CSS
* Bootstrap

<br>

> ## 기능 정리
### [ 1단계 ] - 웹화면 UI 설계
**1. 회원가입, 로그인**  
  * 회원가입 시, 필요한 정보 입력 받기
  * 로그인 시, 필요한 정보 입력 받기
    
**2. 메인 페이지**
   * 공고/이력서 목록, Header, Footer
     
**3. 개인 페이지**
   * 이력서 작성ㆍ수정ㆍ삭제
   * 기업에게 제안 받은 공고 확인
   * 공고 상세 보기
   * 정보 수정  
     
**4. 기업 페이지**
   * 공고 작성ㆍ수정ㆍ삭제
   * 이력서를 보고 구직자에게 제안하기
   * 정보 수정  

### [ 2단계 ]
* 회원가입 시, 중복 ID 여부 확인
* 로그인 시, 비밀번호 확인 
* 개인ㆍ기업 정보 수정

### [ 3단계 ]
* 이력서ㆍ공고 작성, 수정, 삭제
* 이력서ㆍ공고 상세보기 페이지
* 받은 지원ㆍ제안 확인
* 합격ㆍ불합격 통보 

### [ 4단계 ]
* 페이징
* 스크랩 
* 검색 기능 
* 사진 변경 및 추가
* 비밀번호 암호화

<br>

> ## 테이블 모델링 
![테이블](https://github.com/chugue/project-grow/assets/153585866/68639d5f-ec6f-470b-9866-058a43843df3)

<br>

> ## 컨벤션
* 적어도 되고, 노션 링크를 올려도 될 듯 함 

<br>

> ## 담당 기능 *-> !!기능 정리와 비슷하기 때문에 필요없으면 해당 부분은 삭제해도 될 듯함!!* 
### 공통
* 테이블 설계
* View <-*백엔드 기능 구현을 위주로 적으면 좋을 것 같아서 뷰는 공통사항으로 뺌.*
  
### 김성훈 (팀장)
* 담당기능을 적으세요
* 여기다가
* 쭉 적으세요
  
### 김지훈
* 담당기능을 적으세요
* 쭉
* 적으세요
  
### 심유주
* 이력서 수정
* 이력서 삭제

### 하승진
* 담당 기능을 적으세요
* 담당
* 쭉쭉

### 송채현
* 로그아웃
* 회원가입 시 ID 중복체크
* 이력서 작성

<br>

> ## 구현 화면 -> 이건 꼭 들어가야함!!! 
*시간도 없고... gif 로 올릴 필요 없이, 무슨 페이지인지 설명해주고, 캡쳐 붙여넣기만 해도 충분할 듯함*
## 회원가입
이미지 

## 로그인
이미지 

<br>











