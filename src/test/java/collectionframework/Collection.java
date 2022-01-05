package collectionframework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * 컬렉션 프레임워크의 핵심 인터페이스 특징
 *
 * [Collection]
 * List: 중복을 허용하면서 저장순위가 유지되는 컬렉션을 구현하는데 사용
 * Set: 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션 클래스를 구현하는데 사용
 *
 * [Collection X]
 * Map: 키와 값을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는데 사용(키는 중복 X),
 * 기존에 저장된 키와 값을 동일하게 저장하면 기존의 값은 없어지고 마지막에 저장된 값만 남는다.
 *
 * 컬렉션 프레임웍의 모든 컬렉션들은 List, Set, Map 중에 하나를 구현하고 있으며, 구현한 인터페이스의 이름이 클래스의 이름에 포함되어 있어 구현 클래스의 이름만으로도
 * 클래스의 특징을 쉽게 알아낼 수 있다.
 *
 */
public class Collection {
//    @Test
//    public void() throws Exception {
//        //given
//        HashMap map = new HashMap();
//        map.put(1, 2);
//
//        HashMap map2 = new HashMap();
//        map2.putAll(map);
//
//
//        // when
//
//        // then
//    }
}
