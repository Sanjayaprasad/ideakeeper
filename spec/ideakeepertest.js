
var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;
var assert = require('assert');
var expect = require('expect');
var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('get idea');
driver.findElement(By.id('click'))
.click().then(function(){
    return driver.findElement(By.id("text")).getAttribute("value");
})
.then(function (value) {
    expect("get idea").toEqual('get idea');
    //done();
});
driver.quit();
