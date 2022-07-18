package com.rashid.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static String URL = "https://mail.ru/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Рашид/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
    }
}
