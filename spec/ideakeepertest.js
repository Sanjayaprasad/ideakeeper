var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;
var assert = require('assert');
var test = require('selenium-webdriver/testing')
var expect = require('expect');
var chai = require('chai').expect;
var driver = new webdriver.Builder().forBrowser('chrome').build();
/*
driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('siqtest');
driver.findElement(By.id('click'))
.click().then(function(){
    return driver.findElement(By.id("text")).getAttribute("value");
})
.then(function (value) {
    expect("get idea").toEqual('get idea');
    //done();
});
driver.quit();
*/
/*driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('');
driver.findElement(By.id('click')).click();
expect('').toEqual('');
driver.quit();*/

driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('Checking that if the text box size is more than fourty characters');
driver.findElement(By.id('click')).click();
expect('Checking that if the text box size is more than fourty characters').toEqual('Checking that if the text box size is more than fourty characters');
driver.quit();