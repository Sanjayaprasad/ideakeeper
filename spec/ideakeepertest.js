
var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;

var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get('http://localhost:3000/api');
driver.findElement(By.id('text')).sendKeys('get idea');
driver.findElement(By.id('click')).click();
driver.quit();