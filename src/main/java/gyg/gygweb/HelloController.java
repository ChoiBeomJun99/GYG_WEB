package gyg.gygweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//리액트랑 연동 잘되는지 테스트용 컨트롤러
@RestController
public class HelloController {
    @GetMapping("hello")
    public List<String> Hello(){
        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");
    } 
}
