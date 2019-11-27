package me.eastglow.controller;

import me.eastglow.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Slf4j
@Controller
public class MainController {

    @Resource
    private MainService mainService;

    @GetMapping("/main")
    public String main(Model model) {
        String URL = "http://svntest.com:443/!/#myrepo/history";

        System.setProperty("webdriver.gecko.driver", "D:\\workspace\\svn-history-crawling\\src\\main\\resources\\static\\geckodriver.exe");

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("permissions.default.image", 2);
        profile.setPreference("permissions.default.stylesheet", 2);
        profile.setPreference("dom.ipc.plugins.enabled.libflashplayer.so", false);

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        options.setProfile(profile);

        WebDriver wd = new FirefoxDriver(options);
        wd.get("http://test:test@svntest.com:443");

        wd.get("http://svntest.com:443/!/#myrepo/history");
        WebElement first = wd.findElement(By.id("history-list"));

        model.addAttribute("contents", first.getAttribute("innerHTML"));

        return "main";
    }
}
