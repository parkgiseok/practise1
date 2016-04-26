// 여러 개의 속성 값을 설정하
package step27$Annotation.exam06;

// 여러 개의 속성 값을 지정할 때는 value라고 할지라도
// 이름을 생략할 수 없다.
// @Component("오호라...", title="title", no=333)
@Component(value="오호라...", title="title", no=333) // title은 생략 불가
public class Member2 {
  
}
