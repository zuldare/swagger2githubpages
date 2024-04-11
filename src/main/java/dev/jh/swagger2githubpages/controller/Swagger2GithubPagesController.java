package dev.jh.swagger2githubpages.controller;

import dev.jh.swagger2githubpages.dto.ResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class Swagger2GithubPagesController {

    @GetMapping
    public List<ResultDto> getResults(){
        return List.of(new ResultDto(1, "First result"), new ResultDto(2,"Second result"));
    }

}
