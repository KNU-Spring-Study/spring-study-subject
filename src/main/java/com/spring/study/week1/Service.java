package com.spring.study.week1;

public class Service {

    /** Service가 ListRepository에서 MapRepository를 사용하도록 바꿀 때, Service의 코드 변경이 가장 적도록 프로그램을 만들어 보세요~
     * @tip 어떤 방식이든 상관 없습니다. 지금의 Service 코드를 다른 방식으로 변경해도 되고, 새로운 클래스를 만들거나 xxRepository의 코드를 변경해도 됩니다!
     * @+ ListRepository -> MapRepository로 변경할 때 Service 코드의 변경이 가장 적어야 합니다.
     */

    /* 기존 코드 */
//     private final ListRepository repository = new ListRepository();


    /* 변경 코드 */

    /* Structer 인터페이스 생성 및 사용하여 코드 변경 줄일 수 있음.
       ListRepository와 MapRepository 모두 Structure을 상속받았으므로 두 객체 모두 다형성을 통해 Structure 인스턴스로 할당할 수 있다.
       ListRepository -> MapRepository 변경 시 new ListRepository() -> new MapRepository() 글자 몇 개만 바꾸면 됨~ */

    private final Structure repository = new MapRepository();
    public Object saveAndFind(Object o) {
        repository.save(new Object());
        return repository.findItem(0);
    }
}
