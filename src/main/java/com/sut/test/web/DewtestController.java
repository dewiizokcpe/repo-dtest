package com.sut.test.web;
import com.sut.test.domain.Dewtest;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dewtests")
@Controller
@RooWebScaffold(path = "dewtests", formBackingObject = Dewtest.class)
public class DewtestController {
}
