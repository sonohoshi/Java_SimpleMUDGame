# Kill / Monster
2020학년도 대덕소프트웨어마이스터고 자바 프로그래밍 과목 수행평가로 한 시간 동안 만든 텍스트 게임입니다.  

class와 그에 관련된 기능인 상속, 오버로딩, 오버라이딩에 대한 개념을 숙지했는지 확인하기 위해 수행한 과제로, 최대한 간단하게 한 시간 내에 만들어야했기에 단순히 Entity 클래스를 만들고 그를 상속하는 Player, Monster 클래스를 만들어 Main 클래스에서 돌아가도록 만들었다.  

---

게임 진행은 자동으로 플레이어와 몬스터로 서로 공격을 주고 받으며 진행되며, 몬스터가 죽으면 플레이어는 레벨업을 통해 체력 혹은 공격력 혹은 둘 다를 올릴 수 있고, 플레이어가 죽으면 그대로 끝이 난다.  

5스테이지가 될 때마다 플레이어는 최대 체력까지 회복을 한다.  

대강의 테스트를 몇번 돌려본 결과 5 ~ 6스테이지에서 잘 죽는 것 같았다.
