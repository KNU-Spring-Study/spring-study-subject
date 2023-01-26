package com.spring.study.week1;

public class Service {

    /** Service가 ListRepository에서 MapRepository를 사용하도록 바꿀 때, Service의 코드 변경이 가장 적도록 프로그램을 만들어 보세요~
     * @tip 어떤 방식이든 상관 없습니다. 지금의 Service 코드를 다른 방식으로 변경해도 되고, 새로운 클래스를 만들거나 xxRepository의 코드를 변경해도 됩니다!
     * @+ ListRepository -> MapRepository로 변경할 때 Service 코드의 변경이 가장 적어야 합니다.
     */
    private final ListRepository repository = new ListRepository();

    public Object saveAndFind(Object o) {
        repository.save(new Object());
        return repository.findItem(0);
    }
}
